package com.nicordesigns.struts2.insurance.utils;

import com.nicordesigns.struts2.insurance.User;

/*
 * Simple interface for actions that want have the user object injected.  
 */

public interface UserAware {
	
	public void setUser( User user );
	
}