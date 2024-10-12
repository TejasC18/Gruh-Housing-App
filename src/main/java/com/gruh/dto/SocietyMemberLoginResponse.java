package com.gruh.dto;

public class SocietyMemberLoginResponse {
	SocietyMemberDataDTO objSocietyMember;
	String token;
	public SocietyMemberLoginResponse(SocietyMemberDataDTO objSocietyMember, String token) {
		super();
		this.objSocietyMember = objSocietyMember;
		this.token = token;
	}
	public SocietyMemberDataDTO getObjSocietyMember() {
		return objSocietyMember;
	}
	public void setObjSocietyMember(SocietyMemberDataDTO objSocietyMember) {
		this.objSocietyMember = objSocietyMember;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
