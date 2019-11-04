package com.nicordesigns.stuts2.insurance.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nicordesigns.struts2.insurance.service.InsuranceServiceLocator;
import com.nicordesignsstruts2.insurance.model.Agent;

public class MariaDBAgentDao implements AgentDao {
    private static final Logger LOG = LogManager.getLogger(MariaDBAgentDao.class.getName());

    
    @Override
    public Agent getAgent(Integer agentId) throws Exception {
    	Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			InsuranceServiceLocator InsuranceServiceLocator = com.nicordesigns.struts2.insurance.service.InsuranceServiceLocator.getInsuranceServiceLocator();
			
			myConn = InsuranceServiceLocator.getMySQLConnection();

			String sql = "select * from insurance_agents where id=?";

			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, agentId);
			
			myRs = myStmt.executeQuery();

			Agent theAgent = null;
			
			// retrieve data from result set row
			if (myRs.next()) {
				int id = myRs.getInt("AGENT_ID");
				String firstName = myRs.getString("AGENT_FIRST_NAME");
				String lastName = myRs.getString("AGENT_LAST_NAME");
				String middleInitial = myRs.getString("AGENT_MIDDLE_INITIAL");
				String addressLine1 = myRs.getString("AGENT_ADDRESS_LINE1");
				String addressLine2 = myRs.getString("AGENT_ADDRESS_LINE2");
				String city = myRs.getString("AGENT_CITY");
				BigDecimal stateId = myRs.getBigDecimal("AGENT_STATE_ID");
				String postalCode = myRs.getString("AGENT_POSTALCODE");
				String email = myRs.getString("AGENT_EMAIL");
				String password = myRs.getString("AGENT_PASSWORD");
				String isActive = myRs.getString("AGENT_ACTIVE_YESNO");
				String canExpense = myRs.getString("AGENT_EXPENSE_ENABLED_YESNO");
				String company = myRs.getString("COMPANY");

				theAgent =new Agent(id, firstName, lastName, middleInitial, addressLine1, addressLine2, city, stateId, postalCode, email, company);
			}
			else {
				throw new Exception("Could not find agent id: " + agentId);
			}

			return theAgent;
		}
		finally {
			close (myConn, myStmt, myRs);
		}
    }

    @Override
    public Agent[] getAllAgents() throws Exception {
       return getInsuranceAgents().toArray(new Agent[getInsuranceAgents().size()]);
    	
    }
    
    public List<Agent> getInsuranceAgents() throws Exception {
		List<Agent> agents = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			InsuranceServiceLocator InsuranceServiceLocator = com.nicordesigns.struts2.insurance.service.InsuranceServiceLocator.getInsuranceServiceLocator();
			myConn = InsuranceServiceLocator.getMySQLConnection();

			String sql = "select * from insurance_agents order by agent_last_name";

			myStmt = myConn.createStatement();

			myRs = myStmt.executeQuery(sql);

			// process result set
			while (myRs.next()) {
				
				// retrieve data from result set row
				int id = myRs.getInt("AGENT_ID");
				String firstName = myRs.getString("AGENT_FIRST_NAME");
				String lastName = myRs.getString("AGENT_LAST_NAME");
				String middleInitial = myRs.getString("AGENT_MIDDLE_INITIAL");
				String addressLine1 = myRs.getString("AGENT_ADDRESS_LINE1");
				String addressLine2 = myRs.getString("AGENT_ADDRESS_LINE2");
				String city = myRs.getString("AGENT_CITY");
				BigDecimal stateId = myRs.getBigDecimal("AGENT_STATE_ID");
				String postalCode = myRs.getString("AGENT_POSTALCODE");
				String email = myRs.getString("AGENT_EMAIL");
				String password = myRs.getString("AGENT_PASSWORD");
				String isActive = myRs.getString("AGENT_ACTIVE_YESNO");
				String canExpense = myRs.getString("AGENT_EXPENSE_ENABLED_YESNO");
				String company = myRs.getString("COMPANY");
				
				
				
				// create new Agent object
				Agent tempAgent = new Agent(id, firstName, lastName, middleInitial, addressLine1, addressLine2, city, stateId, postalCode, email, company);

				// add it to the list of Agents
				agents.add(tempAgent);
			}
			
			return agents;
				
		}
		finally {
			close (myConn, myStmt, myRs);
		}
		
		
			
		
	}
    
    private void close(Connection theConn, Statement theStmt) {
		close(theConn, theStmt, null);
	}
	
	private void close(Connection theConn, Statement theStmt, ResultSet theRs) {

		try {
			if (theRs != null) {
				theRs.close();
			}

			if (theStmt != null) {
				theStmt.close();
			}

			if (theConn != null) {
				theConn.close();
			}
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}	

    @Override
    public void updateAgent(Agent agent) {
        Integer id = agent.getId();
//        for (int i = 0; i < agents.size(); i++) {
//            Agent p = agents.get(i);
//            if (p.getId().equals(id)) {
//                //agent.setCountry(AgentSupportDao.getCountry(agent.getCountry().getCountryId()));
//                agents.set(i, agent);
//                break;
//            }
//        }
    }

    @Override
    public void insertAgent(Agent agent) {
        int lastId = 0;
//        for (Agent p : agents) {
//            if (p.getId() > lastId) {
//                lastId = p.getId();
//            }
//        }
//        agent.setId(lastId + 1);
//        //agent.setCountry(AgentSupportDao.getCountry(agent.getCountry().getCountryId()));
//        agents.add(agent);
    }

    @Override
    public void deleteAgent(Integer id) {
//        for (int i = 0; i < agents.size(); i++) {
//            Agent agent = agents.get(i);
//            if (agent.getId().equals(id)) {
//                agents.remove(i);
//                break;
//            }
//        }
    }
}
