package com.nicordesignsstruts2.insurance.model;

import java.io.Serializable;
import java.math.BigInteger;

public class Agent implements Serializable, Cloneable {

	
	
	public Agent() {
		super();
	}


	public Agent(

			Integer agentId, String agentfname, String agentlname, String agentmi, String agentaddr1, String agentaddr2,
			String agentcity, BigInteger agentstateid, String agentpostalcode, 
			String agentEmail, String company) {
		super();
		this.id = agentId;
		this.firstName = agentfname;
		this.lastName = agentlname;
		this.midddleInitial = agentmi;
		this.addressLine1 = agentaddr1;
		this.addressLine2 = agentaddr2;
		this.city = agentcity;
		this.stateId = agentstateid;
		this.postalCodeZip = agentpostalcode;
		this.email = agentEmail;
		this.company = company;
	}
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String firstName;
	private String lastName;
	private String midddleInitial;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private BigInteger stateId;
	private String postalCodeZip;
	private String email;
	private String company;

	private String phoneNumber;

	private boolean isActive;

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMidddleInitial() {
		return midddleInitial;
	}


	public void setMidddleInitial(String midddleInitial) {
		this.midddleInitial = midddleInitial;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public BigInteger getStateId() {
		return stateId;
	}


	public void setStateId(BigInteger stateId) {
		this.stateId = stateId;
	}


	public String getPostalCodeZip() {
		return postalCodeZip;
	}


	public void setPostalCodeZip(String postalCodeZip) {
		this.postalCodeZip = postalCodeZip;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public boolean isActive() {
		return isActive;
	}


	@Override
	public String toString() {
		return "Agent [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", midddleInitial="
				+ midddleInitial + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
				+ city + ", stateId=" + stateId + ", postalCodeZip=" + postalCodeZip
				+ ", email=" + email + ", company=" + company + ", phoneNumber=" + phoneNumber
				+ ", isActive=" + isActive + "]";
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
