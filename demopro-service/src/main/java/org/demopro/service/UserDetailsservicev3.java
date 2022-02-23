package org.demopro.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.demopro.common.model.Response;
import org.demopro.common.model.ResponseRoleModule;
import org.demopro.common.model.ResponseUserData;
import org.demopro.common.model.ResponseUserRole;
import org.demopro.common.model.Role;
import org.demopro.common.model.RoleModule;
import org.demopro.common.model.User;
import org.demopro.dao.model.ModuleEntity;
import org.demopro.dao.model.ModuleRepository;
import org.demopro.dao.model.RoleEntity;
import org.demopro.dao.model.RoleModuleEntity;
import org.demopro.dao.model.RoleModuleRepository;
import org.demopro.dao.model.RoleRepository;
import org.demopro.dao.model.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.demopro.common.model.Module;
@Service
public class UserDetailsservicev3 {
	 
	  @Autowired 
	  UserRoleRepository userrolerepository;
	  @Autowired
	  RoleModuleRepository rolemodulerepository;
	  @Autowired 
	  RoleModuleService rolemoduleservice;
	  @Autowired
	  RoleRepository rolerepository;
	  @Autowired
	  ModuleRepository mods;
	  @Autowired
	  UserService userservice;
	  @Autowired
	  RoleService roleservice;
	  @Autowired
	  ModuleService moduleservice;
	 
	public int getUserDetails(int userid)
	{
		
		
		  //get user by userid
			User user = userservice.getUserById(userid);
			  ResponseUserData responseuserdata ;
			  UserMaptoResponseUser usermaptoresponseuser = new UserMaptoResponseUser();
			  RoleMapToResponseUserRole rolemaptoresponserole = new RoleMapToResponseUserRole();
			  ModuleMaptoResponseModule moduletoresponsemodule = new ModuleMaptoResponseModule();
			  responseuserdata = usermaptoresponseuser.UsermaptoResponseUser(user);
			  
			//get all roles using roleservice
			  List<Role> allroles  = (List<Role>) roleservice.getAllRole();
			  Map<Integer,Role> rolemap = new HashMap<Integer,Role>();
			  allroles.forEach(role->{
				  rolemap.put(role.getId(),role);
			  });
			  List<ResponseUserRole> responseroles = new ArrayList<ResponseUserRole>();

		  //get everything from module
			  List<Module> allmods  = (List<Module>) moduleservice.getAllModule();
			  Map<Integer,Module> modulemap = new HashMap<Integer,Module>();
			  allmods.forEach(module->{
				  modulemap.put(module.getId(),module);
			  });		 
			  //get everything from role-module
		  List<RoleModule> allrolemodules = (List<RoleModule>) rolemoduleservice.getAllRoleModule();
		  //Initialise a map of role-module
		  Map<Integer,List<Integer>> rolemodulemap = new HashMap<Integer,List<Integer>>();
		  //converting rolemodules to a map
		  allrolemodules.forEach(rm->{
			  try {
			  rolemodulemap.get(rm.getRoleid()).add(rm.getModuleid());
			  }
			  catch(Exception e)
			  {
				 List<Integer> values = new ArrayList<Integer>();
				 values.add(rm.getModuleid());
				  rolemodulemap.put(rm.getRoleid(),values);
			  }
		  });//O(n^2)
		//get all the roleids
		  List<Integer> roleids = userrolerepository.getRoleByUserID(userid);
		  roleids.forEach(roleid->{
			  List<ResponseRoleModule> responsemodules = new ArrayList<ResponseRoleModule>();

			  Role roledetails = rolemap.get(roleid);
			  List<Integer> moduleids = rolemodulemap.get(roleid);
			  moduleids.forEach(moduleid->{
				Module moduledetails = modulemap.get(moduleid); 
			  });
		  });//O(n^2)
		  return 1;
		  
		  
		  
	}
}
