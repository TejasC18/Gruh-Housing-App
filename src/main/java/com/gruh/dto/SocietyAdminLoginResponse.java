package com.gruh.dto;

public class SocietyAdminLoginResponse {
	SocietyAdminDTO objSocietyAdmin;
	String token;
	public SocietyAdminLoginResponse(SocietyAdminDTO objSocietyAdmin, String token) {
		super();
		this.objSocietyAdmin = objSocietyAdmin;
		this.token = token;
	}
	public SocietyAdminDTO getObjSocietyAdmin() {
		return objSocietyAdmin;
	}
	public void setObjSocietyAdmin(SocietyAdminDTO objSocietyAdmin) {
		this.objSocietyAdmin = objSocietyAdmin;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
