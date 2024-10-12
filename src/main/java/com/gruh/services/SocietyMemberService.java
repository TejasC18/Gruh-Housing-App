package com.gruh.services;

import com.gruh.dto.SocietyMemberDataDTO;

public interface SocietyMemberService {

	public SocietyMemberDataDTO societyMemberLogin(int adminId, String password);
	public String generateNewToken();
	String addSocietyMember(SocietyMemberDataDTO objSocietyMember);
}
