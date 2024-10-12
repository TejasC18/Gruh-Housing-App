package com.gruh.services;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gruh.dao.SocietyMemberData;
import com.gruh.dto.SocietyMemberDataDTO;
import com.gruh.repository.SocietyMemberRepository;

@Service
public class SocietyMemberServiceImpl implements SocietyMemberService {

	@Autowired
	SocietyMemberRepository societyMemberRepository;
	
	private static final SecureRandom secureRandom = new SecureRandom(); //threadsafe
	private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); //threadsafe

	@Override
	public String generateNewToken() {
	    byte[] randomBytes = new byte[24];
	    secureRandom.nextBytes(randomBytes);
	    return base64Encoder.encodeToString(randomBytes);
	}
	
	@Override
    public SocietyMemberDataDTO societyMemberLogin(int adminId, String password) {
        Optional<SocietyMemberData> optionalSocietyMember = societyMemberRepository.findById(adminId);
        if (optionalSocietyMember.isPresent())
        {
        	SocietyMemberData objSocietyMember = optionalSocietyMember.get();
        	SocietyMemberDataDTO passObjSocietyMember = new SocietyMemberDataDTO();
            if (objSocietyMember.getSocietyMemberPassword().equals(password))
            {
            	passObjSocietyMember.setSocietyMemberID(objSocietyMember.getSocietyMemberID());
            	passObjSocietyMember.setSocietyMemberFirstName(objSocietyMember.getSocietyMemberFirstName());
            	passObjSocietyMember.setSocietyMemberLastName(objSocietyMember.getSocietyMemberLastName());
            	passObjSocietyMember.setSocietyID(objSocietyMember.getSocietyID());
            	passObjSocietyMember.setSocietyMemberFlatNumber(objSocietyMember.getSocietyMemberFlatNumber());
            	passObjSocietyMember.setSocietyMemberFloor(objSocietyMember.getSocietyMemberFloor());
            	passObjSocietyMember.setSocietyMemberBuilding(objSocietyMember.getSocietyMemberBuilding());
            	passObjSocietyMember.setSocietyMemberEmail(objSocietyMember.getSocietyMemberEmail());
            	passObjSocietyMember.setSocietyMemberLandline(objSocietyMember.getSocietyMemberLandline());
            	passObjSocietyMember.setSocietyMemberMobileNumber(objSocietyMember.getSocietyMemberMobileNumber());
                return passObjSocietyMember;
            }
        }
        return null;
    }
}
