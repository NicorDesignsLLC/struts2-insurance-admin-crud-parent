package com.nicordesigns.struts2.insurance.service;
import org.apache.logging.log4j.Logger;

//this exception is thrown when there is some problem in locating resources

public class ServiceException extends BaseRuntimeException {
  //constructor 
  public ServiceException(String msg)  {
     super(msg);
	try
	{
		Logger logger = InsuranceServiceLocator.getFortisLogger();
		if(logger.isDebugEnabled())
		logger.debug(msg);
	}catch(Exception ee){}
  }
}
