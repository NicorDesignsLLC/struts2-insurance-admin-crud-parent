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

import com.nicordesigns.struts2.insurance.AgentAction;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.config.entities.ActionConfig;

public class AgentActionTest extends ConfigTest {

	private static Map<String, Object> createMap() {
	    Map<String,Object> myMap = new HashMap<String,Object>();
	    myMap.put("a", "b");
	    myMap.put("c", "d");
	    return myMap;
	}

	public void FIXME_testListAgentsConfig() throws Exception {
        ActionConfig config = assertClass("example", "ListAgents_input", "example.ListAgents");
        assertResult(config, ActionSupport.SUCCESS, "Menu");
        assertResult(config, ActionSupport.INPUT, "/example/AgentAction.jsp");
    }

    public void FIXME_testListAgentsSubmit() throws Exception {
        AgentAction agentAction = container.inject(AgentAction.class);
        Map<String, Object> session = createMap();
        agentAction.setSession(session);
        String result = agentAction.execute();
        assertSuccess(result);
    }


    // Needs access to an envinronment that includes validators
    public void FIXME_testListAgentsSubmitInput() throws Exception {
        AgentAction AgentAction = container.inject(AgentAction.class);
        String result = AgentAction.execute();
        assertInput(result);
        Map errors = assertFieldErrors(AgentAction);
        assertFieldError(errors,"username","Username is required.");
        assertFieldError(errors,"password","Password is required.");
    }

}
