package com.nicordesigns.struts2.insurance.utils;

import java.util.Hashtable;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class FuneralServiceLocator {

	private static FuneralServiceLocator funeralServiceLocator = null;

	private static Logger fortisLogger = LogManager.getLogger(FuneralServiceLocator.class);
	private static Hashtable resourceCache = null;
	private static String realPath = "";
	private static DataSource ds = null;
	private static DataSource dsMySQL = null;

	public FuneralServiceLocator() {
		resourceCache = new Hashtable();
	}

	static {
		funeralServiceLocator = new FuneralServiceLocator();
	}

	/**
	 * Method for setting the Datasource.
	 */
	public static void setDSource(DataSource datasource) {
		ds = datasource;
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
		fortisLogger = log;
	}

	/**
	 * returns InsuranceServiceLocator Instance
	 */
	public static FuneralServiceLocator getInstance() {
		return funeralServiceLocator;
	}

	/**
	 * This method returns Database Connection instance
	 */
	public Connection getConnection() {
		Connection connection = null;
		int inoRetries = 0;
		Logger logger = FuneralServiceLocator.getFortisLogger();
		boolean bretry = false;
		do {
			bretry = false;
			try {

				connection = (Connection) ds.getConnection();

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
	 * This method returns Database Connection instance
	 */
	public Connection getMySQLConnection() {
		Connection connection = null;
		int inoRetries = 0;
		Logger logger = FuneralServiceLocator.getFortisLogger();
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
		return fortisLogger;

	}

}
