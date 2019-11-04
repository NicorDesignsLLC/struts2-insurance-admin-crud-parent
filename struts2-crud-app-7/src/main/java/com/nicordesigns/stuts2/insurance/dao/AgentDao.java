package com.nicordesigns.stuts2.insurance.dao;

import com.nicordesignsstruts2.insurance.model.Agent;

/**
 * Data access methods that a AgentDao class
 * must define to provide information about
 * a Agent or collection of Agent objects.
 * 
 * @author bruce phillips
 * @author antonio sánchez
 */
public interface AgentDao {
    
    Agent getAgent(Integer id) throws Exception;
    
    Agent[] getAllAgents() throws Exception;

    void updateAgent(Agent personBean);
    
    void insertAgent(Agent personBean);
    
    void deleteAgent(Integer id);
}
