package com.gruh.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "society_admin")
public class SocietyAdmin {

	@Id
	@Column(name = "soc_admin_id")
	@GeneratedValue(generator="increment")
	int socAdminID;
	
	@Column(name = "society_id")
	int societyID;
	
	@Column(name = "soc_admin_first_name")
	String socAdminFirstName;
	
	@Column(name = "soc_admin_last_name")
	String socAdminLastName;
	
	@Column(name = "soc_admin_role")
	String socAdminRole;
	
	@Column(name = "soc_admin_email")
	String socAdminEmail;
	
	@Column(name = "soc_admin_landline")
	String socAdminLandline;
	
	@Column(name = "soc_admin_mobile")
	String socAdminMobileNumber;
	
	@Column(name = "soc_admin_password")
	String socAdminPassword;

	public int getSocAdminID() {
		return socAdminID;
	}

	public void setSocAdminID(int socAdminID) {
		this.socAdminID = socAdminID;
	}

	public int getSocietyID() {
		return societyID;
	}

	public void setSocietyID(int societyID) {
		this.societyID = societyID;
	}

	public String getSocAdminFirstName() {
		return socAdminFirstName;
	}

	public void setSocAdminFirstName(String socAdminFirstName) {
		this.socAdminFirstName = socAdminFirstName;
	}

	public String getSocAdminLastName() {
		return socAdminLastName;
	}

	public void setSocAdminLastName(String socAdminLastName) {
		this.socAdminLastName = socAdminLastName;
	}

	public String getSocAdminRole() {
		return socAdminRole;
	}

	public void setSocAdminRole(String socAdminRole) {
		this.socAdminRole = socAdminRole;
	}

	public String getSocAdminEmail() {
		return socAdminEmail;
	}

	public void setSocAdminEmail(String socAdminEmail) {
		this.socAdminEmail = socAdminEmail;
	}

	public String getSocAdminLandline() {
		return socAdminLandline;
	}

	public void setSocAdminLandline(String socAdminLandline) {
		this.socAdminLandline = socAdminLandline;
	}

	public String getSocAdminMobileNumber() {
		return socAdminMobileNumber;
	}

	public void setSocAdminMobileNumber(String socAdminMobileNumber) {
		this.socAdminMobileNumber = socAdminMobileNumber;
	}

	public String getSocAdminPassword() {
		return socAdminPassword;
	}

	public void setSocAdminPassword(String socAdminPassword) {
		this.socAdminPassword = socAdminPassword;
	}
	
	
}