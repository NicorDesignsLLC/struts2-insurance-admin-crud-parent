package com.nicordesigns.stuts2.insurance.dao;

import java.util.HashMap;
import java.util.Map;

import com.nicordesignsstruts2.insurance.model.State;

/**
 * @author bruce phillips
 * @author antonio sanchez
 */
public class MariaDBAgentSupportDao implements AgentSupportDao {
    private static final State[] states;
    private static final Map<String, State> statesMap;
    private static final String[] genders = {"male", "female"};
    private static final String[] sports = {"football", "baseball", "basketball", "mtb" };
    private static final String [] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan", "Seat"};

    static {
        states = new State[] {new State("ES", "Spain"),
                    new State("IE", "Ireland"),
                    new State("IT", "Italy"),
                    new State("PL", "Poland"),
                    new State("US", "Usa") };
        
        statesMap = new HashMap<>();
        for (State c : states) {
            statesMap.put(c.getStateId(), c);
        }
    }



    @Override
    public String[] getCarModels() {
        return carModelsAvailable;
    }

    @Override
    public String[] getSports() {
        return sports;
    }

    @Override
    public String[] getGenders() {
        return genders;
    }

    @Override
    public State[] getStates() {
        return states;
    }
    
    static State getState(String countryId) {
        return statesMap.get(countryId);
    }

	
}
