package com.nicordesigns.struts2.insurance.service;


import org.apache.logging.log4j.Logger;

/*
 * This Exception is thrown when there are some problem with database or query
 */
public class BaseRuntimeException extends RuntimeException {

  //constructor 
  public BaseRuntimeException(String msg)  {
      super(msg);
  }
}

