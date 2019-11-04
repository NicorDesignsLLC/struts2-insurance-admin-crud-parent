package com.nicordesigns.struts2.insurance.service;


import com.nicordesignsstruts2.insurance.model.Agent;
import com.nicordesignsstruts2.insurance.model.State;

public interface AgentService {
	
	 Agent[] getAllAgents() throws Exception;
	 
	 Agent getAgent(Integer id) throws Exception;
	 
	 State[] getStates();

}
