package com.gruh.services;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gruh.dao.UserData;
import com.gruh.dto.UserDataDTO;
import com.gruh.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	private static final SecureRandom secureRandom = new SecureRandom(); //threadsafe
	private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); //threadsafe

	@Override
	public String generateNewToken() {
	    byte[] randomBytes = new byte[24];
	    secureRandom.nextBytes(randomBytes);
	    return base64Encoder.encodeToString(randomBytes);
	}
	
	@Override
    public UserDataDTO userLogin(int userId, String password) {
        Optional<UserData> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent())
        {
        	UserData objUser = optionalUser.get();
        	UserDataDTO passObjUser = new UserDataDTO();
            if (objUser.getUserPassword().equals(password))
            {
            	passObjUser.setUserID(userId);
            	passObjUser.setUserFirstName(objUser.getUserFirstName());
            	passObjUser.setUserLastName(objUser.getUserLastName());
            	passObjUser.setUserEmail(objUser.getUserEmail());
            	passObjUser.setUserLandline(objUser.getUserLandline());
            	passObjUser.setUserMobileNumber(objUser.getUserMobileNumber());
            	passObjUser.setUserOccupation(objUser.getUserOccupation());
                return passObjUser;
            }
        }
        return null;
    }
}
