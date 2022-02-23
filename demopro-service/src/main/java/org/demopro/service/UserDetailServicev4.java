package org.demopro.service;



	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
import java.util.stream.Collectors;

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
	public class UserDetailServicev4 {		 
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
			
			 List<Role> roles = roleservice.getAllRole();
			  //user-->roles
			 //key-->user -->roles
			 //userid  --> [user->role->module]
			 List<Integer> rolesofuser = userrolerepository.getRoleByUserID(userid);
			 System.out.println( roles.stream().collect(Collectors.toMap(Role::getId,Role::getName)));
			 
			  return 1;
			  
			  
		}
	}


