package com.gruh.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_data")
public class UserData {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(generator="increment")
	int userID;
	
	@Column(name = "user_first_name")
	String userFirstName;
	
	@Column(name = "user_last_name")
	String userLastName;
	
	@Column(name = "user_email")
	String userEmail;
	
	@Column(name = "user_landline")
	String userLandline;
	
	@Column(name = "user_mobile")
	String userMobileNumber;
	
	@Column(name = "user_occupation")
	String userOccupation;
	
	@Column(name = "user_password")
	String userPassword;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserLandline() {
		return userLandline;
	}

	public void setUserLandline(String userLandline) {
		this.userLandline = userLandline;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserOccupation() {
		return userOccupation;
	}

	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
