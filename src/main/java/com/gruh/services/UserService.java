package com.gruh.services;

import com.gruh.dto.UserDataDTO;

public interface UserService {

	public UserDataDTO userLogin(int adminId, String password);
	public String generateNewToken();
	String addUser(UserDataDTO objUser);

}
