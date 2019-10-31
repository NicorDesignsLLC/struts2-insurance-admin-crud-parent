package com.nicordesigns.struts2.insurance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.nicordesigns.struts2.insurance.utils.DAOException;
import com.nicordesigns.struts2.insurance.utils.SQLKeyConstants;

public class InsuranceAdminService {
	
	 /*
	 * This service object implements a memory only persistence.  This class should not be taken as an example of
	 * how to store data, obviously.  When we get to Chapter Nine, we will add real data persistence with JPA, Hibernate,
	 * and a MySQL database.    
	 * 
	 * Note, at this time, Chapter Four, some of the methods of this service object
	 * are only stubs or partial implementations of functionality.  This class will 
	 * become more complete with each chapter's version of the Struts 2 Portfolio.
	 */
	private static Map users = new HashMap ();
	
	private static com.nicordesigns.struts2.insurance.utils.FuneralServiceLocator funServLocator = null;

	
	static {
		HashMap portfolios;
		Portfolio port;
		
		User user1 = new User ( );
		user1.setUsername( "Arty" );
		user1.setFirstName("Artus");
		user1.setLastName("Brown");
		user1.setPassword( "password" );
		user1.setBirthday(new Date());
		user1.setPortfolioName("Arty's Portfolio");
		user1.setReceiveJunkMail( true );
		
		portfolios = new HashMap();
		port = new Portfolio();
		port.setName( "Paintings");
		portfolios.put ( port.getName(), port );

		port = new Portfolio();
		port.setName( "Photos");
		portfolios.put ( port.getName(), port );

		user1.setPortfolios( portfolios );
		users.put( user1.getUsername(), user1 );
		
		User user2 = new User ( );
		user2.setUsername( "Mary" );
		user2.setFirstName("Mary");
		user2.setLastName("Greene");
		user2.setPassword( "max" );
		user2.setBirthday(new Date());
		user2.setPortfolioName("Mary's Portfolio");
	
		portfolios = new HashMap();
		port = new Portfolio();
		port.setName( "Oil Paintings");
		portfolios.put ( port.getName(), port );

		port = new Portfolio();
		port.setName( "Wood Cuts");
		portfolios.put ( port.getName(), port );

		user2.setPortfolios( portfolios );
		users.put( user2.getUsername(), user2 );
		
		User user3 = new User ( );
		user3.setUsername( "Jimmy" );
		user3.setFirstName("James");
		user3.setLastName("Brown");
		user3.setPassword( "jax" );
		user3.setBirthday(new Date());
		user3.setPortfolioName("Jimmy's Portfolio");
		user3.setReceiveJunkMail( true );
		
		portfolios = new HashMap();
		port = new Portfolio();
		port.setName( "Lithography");
		portfolios.put ( port.getName(), port );

		port = new Portfolio();
		port.setName( "Monotypes");
		portfolios.put ( port.getName(), port );

		user3.setPortfolios( portfolios );
		users.put( user3.getUsername(), user3 );
		
		User user4 = new User ( );
		user4.setUsername( "Charlie Joe" );
		user4.setFirstName("Chuck");
		user4.setLastName("English");
		user4.setPassword( "cax" );
		user4.setBirthday(new Date());
		user4.setPortfolioName("Charlie Joe's Portfolios");

		portfolios = new HashMap();
		port = new Portfolio();
		port.setName( "Crayola");
		portfolios.put ( port.getName(), port );

		port = new Portfolio();
		port.setName( "Impressions");
		portfolios.put ( port.getName(), port );

		user4.setPortfolios( portfolios );
		users.put( user4.getUsername(), user4 );
		
		funServLocator = com.nicordesigns.struts2.insurance.utils.FuneralServiceLocator.getInstance();
		
	}
	
	public Collection getDBUsers() throws Exception {
		//SQLCode sqlCode = SQLCode.getInstance();
		ResultSet rs = null;
		ArrayList arr = new ArrayList();
		Connection conn = null;
		PreparedStatement ps = null;
		int inoRetries = 0;
		boolean bretry = false;
		
		do {
			bretry = false;
			try {
				conn = funServLocator.getMySQLConnection();
				System.out.println("conn="+conn.toString());
				ps = conn.prepareStatement("SELECT id, first_name, last_name, email, password FROM ADMIN_USER");
				
				rs = ps.executeQuery();

				// Used on SelectFH screen for producers dropdown

				while (rs.next()) {
					System.out.println("Id: " + rs.getString("id"));
					System.out.println("First Name: " + rs.getString("first_name"));
					System.out.println("Last Name: " + rs.getString("last_name"));
					System.out.println("Email: " + rs.getString("email"));
					System.out.println("Password: " + rs.getString("password"));
				}
				//Add the DB Users to the HashMap here
				
			} catch (SQLException stConn) {
				if (inoRetries < SQLKeyConstants.STALECONN_MAX_RETRIES) {
					inoRetries++;
					//logger.debug("Trying To Reconnect " + inoRetries);
					bretry = true;
				} else { // Enough Can't Restore Throw Exception
					bretry = false;
					try {
						throw new DAOException(
								"Error has occurred in Fetching agents in getProducers method inFuneralDAO.java :"
										+ stConn);
					} catch (Exception e) {
						bretry = false;
					}
				}
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (ps != null)
						ps.close();
					if (conn != null)
						conn.close();
				} catch (Exception ee) {
				}
			}
		} while (bretry);
		return arr;
	}
		
	public boolean userExists ( String username ) {
		
		return users.containsKey( username );  
		
	}
	
	public void createAccount ( User user ){
		/* Persist account. */
		users.put( user.getUsername(), user );
	}
	
	public void updateAccount ( User user ) {
		
		/* update account */
	}
	
	
	/* 
	 * Returns a user object if the username and password are valid.  Returns null otherwise.
	 */
	public User authenticateUser(String username, String password) {
		
		System.out.println("Authenticating: username = " + username );
	
		/* 
		 * Retrieve a user object.
		 * We're building a copy so that it mirrors the behaviour of the persistence backed object.
		 */
		User persistedUser = (User) users.get( username );
		User userModel = null;
		
		/* If the username mapped to a real user, check password */
		if ( persistedUser != null && persistedUser.getPassword().equals( password )) {
			
			/* create User object to return for the application to use */
			userModel = getModelCopy ( persistedUser );
		}
	
		return userModel;
	}
	
	public void persistUser ( User user ){
		
		String key = user.getUsername();
		System.out.println( "persisting username = " + key + ", key exists = " + users.containsKey( key ));
		System.out.println("password = " + user.getPassword());
		users.remove( user.getUsername() );
		users.put(user.getUsername(), user );
		
	}
	
	
	/* 
	 * This is so we can keep our memory persistence objects separate from the objects
	 * used by the application.  Pretending like the memory map is more of a persistence storage so
	 * that we have methods more applicable to persistent storage when we change this.
	 */
	
	private User getModelCopy(User persistedUser) {
		User copy = new User ();
	
		copy.setUsername( persistedUser.getUsername() );
		copy.setPassword( persistedUser.getPassword() );
		copy.setPortfolioName( persistedUser.getPortfolioName() );
		copy.setAge( persistedUser.getAge() );
		copy.setBirthday( persistedUser.getBirthday());
		copy.setFirstName( persistedUser.getFirstName() );
		copy.setLastName( persistedUser.getLastName());
		copy.setReceiveJunkMail( persistedUser.getReceiveJunkMail() );
	
		//copy portfolios
		Map portfolios = persistedUser.getPortfolios();
		
		copy.setPortfolios( new HashMap() );
		for (Iterator iter = portfolios.values().iterator(); iter.hasNext();) {
			Portfolio element = (Portfolio) iter.next();
			Portfolio tempPort = new Portfolio ();
			tempPort.setName( element.getName() );
			tempPort.setOwner( element.getOwner() );
			copy.getPortfolios().put( tempPort.getName(), tempPort );
		}
		return copy;
	}

	public Collection getUsers(){
		
		ArrayList usersList = new ArrayList();
		usersList.addAll ( users.values() );
		return usersList;
	}
	
	public Map getUsersAsMap(){
		
		return users;
	}
		
	public Collection getAllPortfolios() {
		
		ArrayList portfolios = new ArrayList();
		
		for (Iterator iter = getUsers().iterator(); iter.hasNext();) {
			User user = (User) iter.next();
			portfolios.addAll(user.getPortfolios().values());
		}
		
		return portfolios;
			
	}
	
	public User getUser( String username ){
		
		User persistedUser = (User )users.get(username);
		return getModelCopy(persistedUser);
		
	}
	
	public Portfolio getPortfolio ( String username, String portfolioName ){
		
		User user = getUser( username );
		return (Portfolio) user.getPortfolios().get( portfolioName );
		
	}

	/* No real logic implemented */
	
	public String getDefaultUser() {
		
		Collection users = getUsers();
		Iterator iter = users.iterator();
		String defaultUsername= null;
			
		if ( iter.hasNext() ) {
			User user = (User) iter.next();
			defaultUsername = user.getUsername();
		}
		return defaultUsername;
	}
	

}
