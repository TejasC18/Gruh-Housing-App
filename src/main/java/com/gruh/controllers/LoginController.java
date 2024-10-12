package com.gruh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gruh.dto.AdminLoginResponse;
import com.gruh.dto.GruhAdminsDTO;
import com.gruh.dto.RequestBodyObject;
import com.gruh.dto.SocietyAdminDTO;
import com.gruh.dto.SocietyAdminLoginResponse;
import com.gruh.dto.SocietyMemberDataDTO;
import com.gruh.dto.SocietyMemberLoginResponse;
import com.gruh.dto.UserDataDTO;
import com.gruh.dto.UserLoginResponse;
import com.gruh.services.AdminService;
import com.gruh.services.SocietyAdminService;
import com.gruh.services.SocietyMemberService;
import com.gruh.services.UserService;

@RestController
@RequestMapping("/login") 
public class LoginController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	SocietyAdminService societyAdminService;
	
	@Autowired
	SocietyMemberService societyMemberService;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/authenticate")//www.localhost:8080/login/authenticate
	public Object authenticate(@RequestBody RequestBodyObject obj)
	{
		String admin = "admin";
		String user = "user";
		String societyMember = "societyMember";
		String societyAdmin = "societyAdmin";
		if(obj.getUserType().equalsIgnoreCase(user))
		{
			int id = Integer.parseInt(obj.getID());
			UserDataDTO objUser = userService.userLogin(id,obj.getPassword());
			String token = adminService.generateNewToken();
			UserLoginResponse response = new UserLoginResponse(objUser,token);
			return response;
		}
		else if(obj.getUserType().equalsIgnoreCase(societyMember))
		{
			int id = Integer.parseInt(obj.getID());
			SocietyMemberDataDTO objSocietyMember = societyMemberService.societyMemberLogin(id, obj.getPassword());
			String token = adminService.generateNewToken();
			SocietyMemberLoginResponse response = new SocietyMemberLoginResponse(objSocietyMember,token);
			return response;
		}
		else if(obj.getUserType().equalsIgnoreCase(societyAdmin))
		{
			int id = Integer.parseInt(obj.getID());
			SocietyAdminDTO objSocietyAdmin = societyAdminService.societyAdminLogin(id, obj.getPassword());
			String token = adminService.generateNewToken();
			SocietyAdminLoginResponse response = new SocietyAdminLoginResponse(objSocietyAdmin,token);
			return response;
		}
		else if(obj.getUserType().equalsIgnoreCase(admin))
		{
			int id = Integer.parseInt(obj.getID());
			GruhAdminsDTO objAdmin = adminService.adminLogin(id, obj.getPassword());
			String token = adminService.generateNewToken();
			AdminLoginResponse response = new AdminLoginResponse(objAdmin,token);
			return response;
		}
		else 
		{
			return null;
		}
	}
}
