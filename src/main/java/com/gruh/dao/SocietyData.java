package com.gruh.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "society_data")
public class SocietyData {

	@Id
	@Column(name = "society_id")
	@GeneratedValue(generator="increment")
	int societyID;
	
	@Column(name = "society_name")
	String societyName;
	
	@Column(name = "society_address1")
	String societyAddress1;
	
	@Column(name = "society_address2")
	String societyAddress2;
	
	@Column(name = "society_locality")
	String societyLocality;
	
	@Column(name = "society_city")
	String societyCity;
	
	@Column(name = "society_state")
	String societyState;
	
	@Column(name = "society_pincode")
	String societyPincode;
	
	@Column(name = "society_email")
	String societyEmail;
	
	@Column(name = "society_landline")
	String societyLandline;
	
	@Column(name = "society_mobile")
	String societyMobileNumber;
	
	@Column(name = "admin_id")
	int adminID;

	public int getSocietyID() {
		return societyID;
	}

	public void setSocietyID(int societyID) {
		this.societyID = societyID;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getSocietyAddress1() {
		return societyAddress1;
	}

	public void setSocietyAddress1(String societyAddress1) {
		this.societyAddress1 = societyAddress1;
	}

	public String getSocietyAddress2() {
		return societyAddress2;
	}

	public void setSocietyAddress2(String societyAddress2) {
		this.societyAddress2 = societyAddress2;
	}

	public String getSocietyLocality() {
		return societyLocality;
	}

	public void setSocietyLocality(String societyLocality) {
		this.societyLocality = societyLocality;
	}

	public String getSocietyCity() {
		return societyCity;
	}

	public void setSocietyCity(String societyCity) {
		this.societyCity = societyCity;
	}

	public String getSocietyState() {
		return societyState;
	}

	public void setSocietyState(String societyState) {
		this.societyState = societyState;
	}

	public String getSocietyPincode() {
		return societyPincode;
	}

	public void setSocietyPincode(String societyPincode) {
		this.societyPincode = societyPincode;
	}

	public String getSocietyEmail() {
		return societyEmail;
	}

	public void setSocietyEmail(String societyEmail) {
		this.societyEmail = societyEmail;
	}

	public String getSocietyLandline() {
		return societyLandline;
	}

	public void setSocietyLandline(String societyLandline) {
		this.societyLandline = societyLandline;
	}

	public String getSocietyMobileNumber() {
		return societyMobileNumber;
	}

	public void setSocietyMobileNumber(String societyMobileNumber) {
		this.societyMobileNumber = societyMobileNumber;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	
	
}
