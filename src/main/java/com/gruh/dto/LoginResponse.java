package com.gruh.dto;

public class LoginResponse {
	
	AdminLoginResponse adminLoginResponse;
	SocietyAdminLoginResponse societyAdminLoginResponse;
	SocietyMemberLoginResponse societyMemberLoginResponse;
	UserLoginResponse userLoginResponse;
	
	public AdminLoginResponse getAdminLoginResponse() {
		return adminLoginResponse;
	}
	public void setAdminLoginResponse(AdminLoginResponse adminLoginResponse) {
		this.adminLoginResponse = adminLoginResponse;
	}
	public SocietyAdminLoginResponse getSocietyAdminLoginResponse() {
		return societyAdminLoginResponse;
	}
	public void setSocietyAdminLoginResponse(SocietyAdminLoginResponse societyAdminLoginResponse) {
		this.societyAdminLoginResponse = societyAdminLoginResponse;
	}
	public SocietyMemberLoginResponse getSocietyMemberLoginResponse() {
		return societyMemberLoginResponse;
	}
	public void setSocietyMemberLoginResponse(SocietyMemberLoginResponse societyMemberLoginResponse) {
		this.societyMemberLoginResponse = societyMemberLoginResponse;
	}
	public UserLoginResponse getUserLoginResponse() {
		return userLoginResponse;
	}
	public void setUserLoginResponse(UserLoginResponse userLoginResponse) {
		this.userLoginResponse = userLoginResponse;
	}
}
