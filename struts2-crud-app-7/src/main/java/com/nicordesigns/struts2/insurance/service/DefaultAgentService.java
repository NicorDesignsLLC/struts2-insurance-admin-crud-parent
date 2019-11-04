package com.nicordesigns.struts2.insurance.service;




import com.nicordesigns.struts2.insurance.dao.MariaDBAgentSupportDao;
import com.nicordesigns.stuts2.insurance.dao.AgentDao;
import com.nicordesigns.stuts2.insurance.dao.AgentSupportDao;
import com.nicordesigns.stuts2.insurance.dao.MariaDBAgentDao;
import com.nicordesignsstruts2.insurance.model.Agent;
import com.nicordesignsstruts2.insurance.model.State;

public class DefaultAgentService implements AgentService {
	
	AgentDao agentDao; 
    AgentSupportDao agentSupportDao; 

    
	public DefaultAgentService() {
		super();
		 agentDao = new MariaDBAgentDao();
         agentSupportDao = new MariaDBAgentSupportDao();
	}

	@Override
	public Agent[] getAllAgents() throws Exception {
		return agentDao.getAllAgents();
	}

	@Override
	public Agent getAgent(Integer id) throws Exception {
		return agentDao.getAgent(id);
	}

	@Override
	public State[] getStates() {
			return agentSupportDao.getStates();
	}

}
