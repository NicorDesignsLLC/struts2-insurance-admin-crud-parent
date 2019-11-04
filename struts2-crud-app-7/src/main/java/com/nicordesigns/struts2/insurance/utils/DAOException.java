package com.nicordesigns.struts2.insurance.utils;


import org.apache.logging.log4j.Logger;
import java.sql.SQLException;

/*
 * This Exception is thrown when there are some problem with database or query
 */
public class DAOException extends BaseException{

  //constructor 
  public DAOException(String msg)  {
    super(msg);
	try
	{
		Logger logger = FuneralServiceLocator.getFortisLogger();
		if(logger.isDebugEnabled())
		  logger.debug(msg);
	}catch(Exception ee){}

  }
}
