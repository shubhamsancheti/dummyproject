package org.demopro.service;

import java.util.ArrayList;
import java.util.List;

import org.demopro.common.model.Role;
import org.demopro.common.model.SuccessResponse;
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
@Service
public class UserDetailService {
	
	  //@Autowired //UserRepository userrepository;
	  
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
	  SuccessResponse success=new SuccessResponse(); 
	  public Response getUserDetails(int userid) { 
		  //1)usertable varibals //2)mappers complete or shortcut //3)exceptions //4)failure 
		  try {
	  User user=userservice.getUserById(userid); 
	  List<Integer> roleids=userrolerepository.getRoleByUserID(userid); 
	  List<Role> roles = new ArrayList<Role>(); roleids.forEach(r ->{
	  
	  List<Integer> modulesid = (rolemoduleservice.getModuleByRoleID(r));
	  List<Module> modules = new ArrayList<Module>();
	  modulesid.forEach(m-> {
		  modules.add(moduleservice.getModuleById(m)); 
		  } ); 
	  	  Role temprole =roleservice.getRoleById(r); 
	  	  temprole.setRolemodule(modules);
	  	  roles.add(temprole);
	  
	  } );
	  
	  user.setUserRole(roles); 
	  success.setErrorCode("404");
	  success.setErrorMessage("User found");
	  success.setSuccess(true);
	  success.setUserdata(user); 
	  return success; 
	  }
	  catch(Exception e) 
	  {
	  FailureResponse fail = new FailureResponse();
	  fail.setErrorCode("404");
	  fail.setErrorMessage("User not found"); 
	  fail.setSuccess(false);
	  fail.setUserData(new User());
	  return fail; 
	  } 
	  }
}
