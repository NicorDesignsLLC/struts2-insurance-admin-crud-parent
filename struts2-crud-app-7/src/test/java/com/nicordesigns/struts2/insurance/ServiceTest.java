package com.nicordesigns.struts2.insurance;

import org.junit.Ignore;
import org.junit.Test;

public class ServiceTest {

    @Test
    @Ignore
    public void insuranceAdminDBAccess() throws Exception {
    	InsuranceAdminService insuranceAdminService = new InsuranceAdminService(); // InsuranceAdminService is tested
    	insuranceAdminService.getDBUsers();	
    }
}