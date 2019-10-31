package com.nicordesigns.struts2.insurance.utils;


import org.apache.logging.log4j.Logger;

/*
 * This Exception is thrown when there are some problem with the application logic
 */
public class BaseException extends RuntimeException {

  //constructor 

  public BaseException(String msg)  {
      super(msg);
  }
}


