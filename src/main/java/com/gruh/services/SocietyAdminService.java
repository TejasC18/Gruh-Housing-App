package com.gruh.services;

import com.gruh.dto.SocietyAdminDTO;

public interface SocietyAdminService {

	public SocietyAdminDTO societyAdminLogin(int adminId, String password);
	public String generateNewToken();
}
