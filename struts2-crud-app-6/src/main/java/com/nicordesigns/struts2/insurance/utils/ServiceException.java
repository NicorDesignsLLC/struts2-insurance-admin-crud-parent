package com.nicordesigns.struts2.insurance.utils;

//this exception is thrown when there is some problem in locating resources

public class ServiceException extends BaseException {
  //constructor 
  public ServiceException(String msg)  {
     super(msg);

  }
}
