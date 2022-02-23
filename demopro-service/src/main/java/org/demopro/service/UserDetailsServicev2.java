package org.demopro.service;

import java.util.ArrayList;
import java.util.List;

import org.demopro.common.model.Role;
import org.demopro.common.model.SuccessResponse;
import org.demopro.common.model.Successv2;
import org.demopro.common.model.User;
//import org.demopro.dao.model.RoleEntity;
//import org.demopro.dao.model.RoleRepository;
import org.demopro.dao.model.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.demopro.dao.model.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.demopro.common.model.FailureResponse;
import org.demopro.common.model.Module;
import org.demopro.common.model.Response;
import org.demopro.common.model.ResponseCode;
import org.demopro.common.model.ResponseRoleModule;
import org.demopro.common.model.ResponseUserData;
import org.demopro.common.model.ResponseUserRole;
@Service
public class UserDetailsServicev2 {
		
		  
		  @Autowired
		  UserService userservice;
		  
		  @Autowired 
		  UserRoleRepository userrolerepository;
		  
		  @Autowired 
		  RoleService roleservice;
		  
		  @Autowired 
		  RoleModuleService rolemoduleservice;
		  
		  @Autowired 
		  ModuleService moduleservice; 
		  Successv2 success=new Successv2(); 
		  public Response getUserDetails(int userid) { 
			  
			  try {
		  ///////////////////////////////////////////////
		  User user=userservice.getUserById(userid); 
		  ResponseUserData responseuserdata ;
		  UserMaptoResponseUser usermaptoresponseuser = new UserMaptoResponseUser();
		  RoleMapToResponseUserRole rolemaptoresponserole = new RoleMapToResponseUserRole();
		  ModuleMaptoResponseModule moduletoresponsemodule = new ModuleMaptoResponseModule();
		  responseuserdata = usermaptoresponseuser.UsermaptoResponseUser(user);
		  ///
		  List<Integer> roleids=userrolerepository.getRoleByUserID(userid); 
		  List<Role> roles = new ArrayList<Role>(); 
		  List<ResponseUserRole> responseroles = new ArrayList<ResponseUserRole>();

		  roleids.forEach(r ->{
		  List<Integer> modulesid = (rolemoduleservice.getModuleByRoleID(r));
		  List<Module> modules = new ArrayList<Module>();
		  List<ResponseRoleModule> responsemodules = new ArrayList<ResponseRoleModule>();
		  
		  modulesid.forEach(m-> {
			  modules.add(moduleservice.getModuleById(m)); 
			  responsemodules.add(moduletoresponsemodule.ModmaptoResponseMod(moduleservice.getModuleById(m)));
			  } ); 
		  	  Role temprole =roleservice.getRoleById(r); 
		  	  ResponseUserRole tempresponserole = rolemaptoresponserole.ModmaptoResponseMod(temprole);
		  	  tempresponserole.setRoleModule(responsemodules);
			  responseroles.add(tempresponserole);
			  
		  	  temprole.setRolemodule(modules);
		  	  roles.add(temprole);
		  
		  } );
		  
		  user.setUserRole(roles); 
		  responseuserdata.setUserRole(responseroles);
		  success.setCode(ResponseCode.USER_FOUND.getCode());
		  success.setMessage(ResponseCode.USER_FOUND.getMessage());
		  success.setSuccess(true);
		  success.setUserData(responseuserdata); 
		  return success; 
		  }
		  catch(Exception e) 
		  {
		  FailureResponse fail = new FailureResponse();
		  fail.setErrorCode(ResponseCode.USER_NOT_FOUND.getCode());
		  fail.setErrorMessage(ResponseCode.USER_NOT_FOUND.getMessage()); 
		  fail.setSuccess(false);
		  return fail; 
		  } 
		  }
	}
