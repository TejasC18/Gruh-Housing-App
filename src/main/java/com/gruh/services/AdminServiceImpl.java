package com.gruh.services;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gruh.dao.GruhAdmins;
import com.gruh.dto.GruhAdminsDTO;
import com.gruh.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	private static final SecureRandom secureRandom = new SecureRandom(); //threadsafe
	private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); //threadsafe

	@Override
	public String generateNewToken() {
	    byte[] randomBytes = new byte[24];
	    secureRandom.nextBytes(randomBytes);
	    return base64Encoder.encodeToString(randomBytes);
	}
	
	@Override
    public GruhAdminsDTO adminLogin(int adminId, String password) {
        Optional<GruhAdmins> optionalAdmin = adminRepository.findById(adminId);
        if (optionalAdmin.isPresent())
        {
        	GruhAdmins objAdmin = optionalAdmin.get();
        	GruhAdminsDTO passObjAdmin = new GruhAdminsDTO();
            if (objAdmin.getAdminPassword().equals(password))
            {
            	passObjAdmin.setAdminID(adminId);
            	passObjAdmin.setAdminFirstName(objAdmin.getAdminFirstName());
            	passObjAdmin.setAdminLastName(objAdmin.getAdminLastName());
            	passObjAdmin.setAdminRole(objAdmin.getAdminRole());
            	passObjAdmin.setEmail(objAdmin.getEmail());
            	passObjAdmin.setLandlineNumber(objAdmin.getLandlineNumber());
            	passObjAdmin.setMobileNumber(objAdmin.getMobileNumber());
                return passObjAdmin;
            }
        }
        return null;
    }
	
	@Override
	public String addAdmin(GruhAdminsDTO objAdmin) {
		GruhAdmins adminEntity = new GruhAdmins();
        BeanUtils.copyProperties(objAdmin,adminEntity);
        adminRepository.save(adminEntity);
        return "Success";
	}
}
