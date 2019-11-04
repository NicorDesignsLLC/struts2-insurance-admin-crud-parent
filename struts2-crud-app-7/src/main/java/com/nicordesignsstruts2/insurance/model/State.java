package com.nicordesignsstruts2.insurance.model;

/**
 * Model a State or Province.
 * 
 * @author bruce phillips
 * @author antonio sánchez
 */
public class State {
    private String stateId;
    private String stateName;

    public State(String stateId, String stateName) {
        setStateId(stateId);
        setStateName(stateName);
    }

    public void setStateId(String stateId) {
        if (stateId == null)
            throw new IllegalArgumentException("State ID must be non-null.");
        
        this.stateId = stateId;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    @Override
    public String toString() {
        return getStateId();
    }
    
    @Override
    public boolean equals(Object o) {
        return (o!=null) 
                && (o instanceof State) 
                && (((State) o).getStateId() != null) 
                && (stateId.equals(((State) o).getStateId()));
    }
}
