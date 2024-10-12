package com.gruh.dto;

public class AdminLoginResponse {
	GruhAdminsDTO objadmin;
	String token;
	
	public AdminLoginResponse(GruhAdminsDTO objadmin, String token) {
		super();
		this.objadmin = objadmin;
		this.token = token;
	}
	
	public GruhAdminsDTO getObjadmin() {
		return objadmin;
	}
	public void setObjadmin(GruhAdminsDTO objadmin) {
		this.objadmin = objadmin;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "AdminLoginResponse [objadmin=" + objadmin.adminFirstName + ", token=" + token + "]";
	}
}
