package com.gruh.services;

import com.gruh.dto.GruhAdminsDTO;

public interface AdminService {

	public GruhAdminsDTO adminLogin(int adminId, String password);
	public String generateNewToken();
	String addAdmin(GruhAdminsDTO objAdmin);
}
