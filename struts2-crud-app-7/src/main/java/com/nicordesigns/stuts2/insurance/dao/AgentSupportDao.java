package com.nicordesigns.stuts2.insurance.dao;

import com.nicordesignsstruts2.insurance.model.State;

//import java.util.Map;

/**
 * Methods a PersonSupportDao class must implement to provide
 * additional information related to a Person.
 * 
 * @author bruce phillips
 * @author antonio sánchez
 */
public interface AgentSupportDao {

    State[] getStates();
    
    String[] getCarModels();
    
    String[] getSports();
    
    String[] getGenders();
    
}
