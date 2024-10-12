package com.gruh.dto;

public class UserLoginResponse {
	UserDataDTO objUser;
	String token;
	
	public UserLoginResponse(UserDataDTO objUser, String token) {
		super();
		this.objUser = objUser;
		this.token = token;
	}
	
	public UserDataDTO getObjUser() {
		return objUser;
	}
	public void setObjUser(UserDataDTO objUser) {
		this.objUser = objUser;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
}
