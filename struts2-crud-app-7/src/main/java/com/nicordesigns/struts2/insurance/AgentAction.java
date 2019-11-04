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

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.nicordesigns.struts2.insurance.service.AgentService;
import com.nicordesigns.struts2.insurance.service.DefaultAgentService;
import com.nicordesignsstruts2.insurance.model.Agent;
import com.nicordesignsstruts2.insurance.model.State;
import com.opensymphony.xwork2.Preparable;

public class AgentAction extends InsuranceSupport implements SessionAware, Preparable {

	private static final Logger LOG = LogManager.getLogger(AgentAction.class.getName());
	private AgentService agentService = new DefaultAgentService();
	private Agent agent;
	private Agent[] agents;
	private String[] sports;
	private String[] genders;
	private State[] states;
	private String[] carModelsAvailable;

	private Map session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
	
	/**
     * Get all agents for display in the view.
	 * @throws Exception 
     */
    public String list() throws Exception {
    	agents = agentService.getAllAgents();
        LOG.info("Listing agents");
        return SUCCESS;
    }

	@Override
	public void prepare() throws Exception {
		// carModelsAvailable = agentService.getCarModels();
		// sports = agentService.getSports();
		states = agentService.getStates();
		// genders = agentService.getGenders();
		LOG.info("Prepared support data for Insurance Agent entity.");

		if (agent != null && agent.getId() != null) {
			agent = agentService.getAgent(agent.getId());
			LOG.info("Preparing actual data for Insurance Agent: " + agent);
		}

	}
	
	public State[] getStates() {
        return states;
    }

}