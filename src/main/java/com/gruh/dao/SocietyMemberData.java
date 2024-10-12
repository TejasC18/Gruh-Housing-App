package com.gruh.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "society_member_data")
public class SocietyMemberData {

	@Id
	@Column(name = "society_member_id")
	@GeneratedValue(generator="increment")
	int societyMemberID;
	
	@Column(name = "society_member_first_name")
	String societyMemberFirstName;
	
	@Column(name = "society_member_last_name")
	String societyMemberLastName;
	
	@Column(name = "society_id")
	int societyID;
	
	@Column(name = "society_member_flat_number")
	String societyMemberFlatNumber;
	
	@Column(name = "society_member_floor")
	String societyMemberFloor;
	
	@Column(name = "society_member_building")
	String societyMemberBuilding;
	
	@Column(name = "society_member_email")
	String societyMemberEmail;
	
	@Column(name = "society_member_landline")
	String societyMemberLandline;
	
	@Column(name = "society_member_mobile")
	String societyMemberMobileNumber;
	
	@Column(name = "society_member_password")
	String societyMemberPassword;

	public int getSocietyMemberID() {
		return societyMemberID;
	}

	public void setSocietyMemberID(int societyMemberID) {
		this.societyMemberID = societyMemberID;
	}

	public String getSocietyMemberFirstName() {
		return societyMemberFirstName;
	}

	public void setSocietyMemberFirstName(String societyMemberFirstName) {
		this.societyMemberFirstName = societyMemberFirstName;
	}

	public String getSocietyMemberLastName() {
		return societyMemberLastName;
	}

	public void setSocietyMemberLastName(String societyMemberLastName) {
		this.societyMemberLastName = societyMemberLastName;
	}

	public int getSocietyID() {
		return societyID;
	}

	public void setSocietyID(int societyID) {
		this.societyID = societyID;
	}

	public String getSocietyMemberFlatNumber() {
		return societyMemberFlatNumber;
	}

	public void setSocietyMemberFlatNumber(String societyMemberFlatNumber) {
		this.societyMemberFlatNumber = societyMemberFlatNumber;
	}

	public String getSocietyMemberFloor() {
		return societyMemberFloor;
	}

	public void setSocietyMemberFloor(String societyMemberFloor) {
		this.societyMemberFloor = societyMemberFloor;
	}

	public String getSocietyMemberBuilding() {
		return societyMemberBuilding;
	}

	public void setSocietyMemberBuilding(String societyMemberBuilding) {
		this.societyMemberBuilding = societyMemberBuilding;
	}

	public String getSocietyMemberEmail() {
		return societyMemberEmail;
	}

	public void setSocietyMemberEmail(String societyMemberEmail) {
		this.societyMemberEmail = societyMemberEmail;
	}

	public String getSocietyMemberLandline() {
		return societyMemberLandline;
	}

	public void setSocietyMemberLandline(String societyMemberLandline) {
		this.societyMemberLandline = societyMemberLandline;
	}

	public String getSocietyMemberMobileNumber() {
		return societyMemberMobileNumber;
	}

	public void setSocietyMemberMobileNumber(String societyMemberMobileNumber) {
		this.societyMemberMobileNumber = societyMemberMobileNumber;
	}

	public String getSocietyMemberPassword() {
		return societyMemberPassword;
	}

	public void setSocietyMemberPassword(String societyMemberPassword) {
		this.societyMemberPassword = societyMemberPassword;
	}
	
}
