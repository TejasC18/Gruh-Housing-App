package com.gruh.services;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gruh.dao.SocietyAdmin;
import com.gruh.dto.SocietyAdminDTO;
import com.gruh.repository.SocietyAdminRepository;

@Service
public class SocietyAdminServiceImpl implements SocietyAdminService {

	@Autowired
	SocietyAdminRepository societyAdminRepository;
	
	private static final SecureRandom secureRandom = new SecureRandom(); //threadsafe
	private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); //threadsafe

	@Override
	public String generateNewToken() {
	    byte[] randomBytes = new byte[24];
	    secureRandom.nextBytes(randomBytes);
	    return base64Encoder.encodeToString(randomBytes);
	}
	
	@Override
    public SocietyAdminDTO societyAdminLogin(int societyAdminID, String password) {
        Optional<SocietyAdmin> optionalSocietyAdmin = societyAdminRepository.findById(societyAdminID);
        if (optionalSocietyAdmin.isPresent())
        {
        	SocietyAdmin objSocietyAdmin = optionalSocietyAdmin.get();
        	SocietyAdminDTO passObjSocietyAdmin = new SocietyAdminDTO();
            if (objSocietyAdmin.getSocAdminPassword().equals(password))
            {
            	passObjSocietyAdmin.setSocAdminID(objSocietyAdmin.getSocAdminID());
            	passObjSocietyAdmin.setSocietyID(objSocietyAdmin.getSocietyID());
            	passObjSocietyAdmin.setSocAdminFirstName(objSocietyAdmin.getSocAdminFirstName());
            	passObjSocietyAdmin.setSocAdminLastName(objSocietyAdmin.getSocAdminLastName());
            	passObjSocietyAdmin.setSocAdminRole(objSocietyAdmin.getSocAdminRole());
            	passObjSocietyAdmin.setSocAdminEmail(objSocietyAdmin.getSocAdminEmail());
            	passObjSocietyAdmin.setSocAdminLandline(objSocietyAdmin.getSocAdminLandline());
            	passObjSocietyAdmin.setSocAdminMobileNumber(objSocietyAdmin.getSocAdminMobileNumber());
            	return passObjSocietyAdmin;
            }
        }
        return null;
    }
	
	@Override
	public String addSocietyAdmin(SocietyAdminDTO objSocietyAdmin) {
		SocietyAdmin societyAdminEntity = new SocietyAdmin();
        BeanUtils.copyProperties(objSocietyAdmin,societyAdminEntity);
        societyAdminRepository.save(societyAdminEntity);
        return "Success";
	}
}
