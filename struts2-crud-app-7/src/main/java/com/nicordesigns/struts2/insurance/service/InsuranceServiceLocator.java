package com.nicordesigns.struts2.insurance.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * This is a singleton class and its initialized from the pluginclass when the
 * ActionServlet is initialized.This class contains logger object and connection
 * object and real path of the application
 */
public class InsuranceServiceLocator {

	private static InsuranceServiceLocator insuranceServiceLocator = null;

	private static Logger insuranceLogger = LogManager.getLogger(InsuranceServiceLocator.class);
	private static String realPath = "";
	private static DataSource dsMySQL = null;

	private InsuranceServiceLocator() {
		
		try {

			DataSource mySQLds = null;
			
			Properties prop = null;
			
			String mySQLdSourceName = InsuranceConstants.MYSQL_DATASOURCE_NAME;

			
			InitialContext ctxW = new InitialContext();
			// Look up the datasource
			mySQLds = (javax.sql.DataSource) ctxW.lookup(mySQLdSourceName);

			InsuranceServiceLocator.setMySQLDSource(mySQLds);
	
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}
	
	public static InsuranceServiceLocator getInsuranceServiceLocator() throws Exception {
		if (insuranceServiceLocator == null) {
			insuranceServiceLocator = new InsuranceServiceLocator();
		}
		
		return insuranceServiceLocator;
	}

	/**
	 * Method for setting the Datasource.
	 */
	public static void setMySQLDSource(DataSource mySQLdataSource) {
		dsMySQL = mySQLdataSource;
	}

	/**
	 * Method for setting the realPath of the Application
	 */
	public static void setRealPath(String path) {
		realPath = path;
	}

	/**
	 * Method for getting the realPath of the Application
	 */
	public static String getRealPath() {
		return realPath;

	}

	/**
	 * Method for setting the Logger.
	 */
	public static void setLogger(Logger log) {
		insuranceLogger = log;
	}

	/**
	 * This method returns Database Connection instance
	 */
	public Connection getMySQLConnection() {
		Connection connection = null;
		int inoRetries = 0;
		Logger logger = InsuranceServiceLocator.getFortisLogger();
		boolean bretry = false;
		do {
			bretry = false;
			try {

				connection = (Connection) dsMySQL.getConnection();

				if (connection == null) {
					throw new ServiceException("Problem with database");
				}

			} catch (SQLException stConn) {
				if (inoRetries < SQLKeyConstants.STALECONN_MAX_RETRIES) {
					inoRetries++;
					logger.debug("Trying To Reconnect Attempt => " + inoRetries);
					bretry = true;
				} else { // Enough Can't Restore Throw Exception
					bretry = false;
					try {
						throw new ServiceException("Database error inside  getConnection() method message :" + stConn);
					} catch (Exception e) {
						bretry = false;
					}
				}
			} catch (NullPointerException np) {
				logger.debug("Database connection not yet available");
			} catch (Exception e) {

				throw new ServiceException("Database error inside  getConnection() method message :" + e);
			}
		} while (bretry);
		return connection;

	}

	/**
	 * This method returns logger instance
	 */
	public static Logger getFortisLogger() {
		return insuranceLogger;

	}

}
