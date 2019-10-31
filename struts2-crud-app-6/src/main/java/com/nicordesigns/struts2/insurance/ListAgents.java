/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.nicordesigns.struts2.insurance;

import java.util.HashMap;
import java.util.Map;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.struts2.interceptor.SessionAware;



public class ListAgents extends InsuranceSupport implements SessionAware {

	
	
	
    public String execute() throws Exception {

        //TODO Get all the Insurance Agents from the DB
    	
    	DataSource mySQLds = null;
    	
    	String mySQLdSourceName = com.nicordesigns.struts2.insurance.utils.PreneedConstants.MYSQL_DATASOURCE_NAME;
    	InitialContext ctxW = new InitialContext();
    	mySQLds = (javax.sql.DataSource) ctxW.lookup(mySQLdSourceName);
    	//Get the ArrayList of Users/Agents that will be displayed in a Struts2 List Table here...
    	getInsuranceAdminService().getDBUsers();
    	//Populate the session and form
    	
//        User user = getInsuranceAdminService().authenticateUser( getUsername(), getPassword() ); 
//		if ( user == null )
//		{
//			/* User not valid, return to input page. */
//			return INPUT;
//		}
//		else{
//			session.put( Struts2PortfolioConstants.USER, user );
//		}
		
		return SUCCESS;
    }


    private Map session;


	
	public InsuranceAdminService getInsuranceAdminService( ) 	{
		
		return new InsuranceAdminService();
		
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}


}