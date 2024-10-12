package com.gruh.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gruh.dao.GruhAdmins;
import com.gruh.dao.SocietyAdmin;
import com.gruh.dao.UserData;
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
	
	@PostMapping("/registerAdmin")//www.localhost:8080/login/registerAdmin
	public boolean registerAdmin(@RequestBody GruhAdmins objAdmin) {
		GruhAdminsDTO adminEntity = new GruhAdminsDTO();
		BeanUtils.copyProperties(objAdmin, adminEntity);
		if(adminService.addAdmin(adminEntity).equalsIgnoreCase("success")) {
			return true;
		}
		return false;
	}
	
	@PostMapping("/registerSocietyMember")//www.localhost:8080/login/registerSocietyMember
	public boolean registerSocietyMember(@RequestBody SocietyMemberDataDTO objSocietyMember) {
		SocietyMemberDataDTO societyMemberEntity = new SocietyMemberDataDTO();
		BeanUtils.copyProperties(objSocietyMember,societyMemberEntity);
		if(societyMemberService.addSocietyMember(societyMemberEntity).equalsIgnoreCase("success")) {
			return true;
		}
		return false;
	}
	
	@PostMapping("/registerUser")//www.localhost:8080/login/registerUser
	public boolean registerUser(@RequestBody UserData objUser) {
		UserDataDTO userEntity = new UserDataDTO();
		BeanUtils.copyProperties(objUser, userEntity);
		if(userService.addUser(userEntity).equalsIgnoreCase("success")) {
			return true;
		}
		return false;
	}
	
	@PostMapping("/registerSocietyAdmin")//www.localhost:8080/login/registerSocietyAdmin
	public boolean registerSocietyAdmin(@RequestBody SocietyAdmin objSocietyAdmin) {
		SocietyAdminDTO societyAdminEntity = new SocietyAdminDTO();
		BeanUtils.copyProperties(objSocietyAdmin, societyAdminEntity);
		if(societyAdminService.addSocietyAdmin(societyAdminEntity).equalsIgnoreCase("success")) {
			return true;
		}
		return false;
	}
}
