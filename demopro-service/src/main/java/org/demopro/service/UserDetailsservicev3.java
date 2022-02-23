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
import org.demopro.common.model.SuccessResponse;
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
	 @Autowired
	 UserRoleService userroleservice;
	 
	public Response getUserDetails(int userid)
	{
		
		
		  //get user by userid
			User user = userservice.getUserById(userid);
			  ResponseUserData responseuserdata ;
			  UserMaptoResponseUser usermaptoresponseuser = new UserMaptoResponseUser();
			  RoleMapToResponseUserRole rolemaptoresponserole = new RoleMapToResponseUserRole();
			  ModuleMaptoResponseModule moduletoresponsemodule = new ModuleMaptoResponseModule();
			  List<ResponseUserRole> user_roles = new ArrayList<>();
			  responseuserdata = usermaptoresponseuser.UsermaptoResponseUser(user);
			  
//			//get all roles using roleservice
//			  List<Role> allroles  = (List<Role>) roleservice.getAllRole();
//			  Map<Integer,Role> rolemap = new HashMap<Integer,Role>();
//			  allroles.forEach(role->{
//				  rolemap.put(role.getId(),role);
//			  });
			  List<ResponseUserRole> responseroles = new ArrayList<ResponseUserRole>();
			  
			List<Integer> userroles =   userroleservice.getUserRoleById(userid);//this is getting all the roleids
			
			List<Role> listofroles = roleservice.getRoleListByRoleIdList(userroles);//roles in rolesids
			
			Map<Integer,List<Integer>> rolemodulelistmap = rolemoduleservice.getRoleModuleListMapByRoleIdList(userroles);
			
			
			List<Integer> moduleids=rolemodulelistmap.values().stream().flatMap(List::stream).collect(Collectors.toList());//all module ids 
			//get all modules related to customer
			List<Module> listofmodules = moduleservice.getModuleListByModuleIdList(moduleids);
			//convert listofmodle to map
			  Map<Integer,Module> modulemap = new HashMap<Integer,Module>();
			  listofmodules.forEach(module->{
				  modulemap.put(module.getId(),module);
			  });	
			  listofroles.forEach(role->{
				 List<Integer> moduleListids  =  rolemodulelistmap.get(role.getId());
				 role.setRolemodule(new ArrayList<Module>());
				 
				 moduleListids.forEach(module->{
					role.getRolemodule().add(modulemap.get(module));
				 });
			  });
				user.setUserRole(listofroles);
				user.getUserRole().forEach(userrole->{
					user_roles.add(rolemaptoresponserole.ModmaptoResponseMod(userrole));

				});
				responseuserdata.setUserRole(user_roles);
				
				SuccessResponse success = new SuccessResponse();
				success.setUserdata(user);
				System.out.println(success);
				return success;
				/*
				 * //get everything from module List<Module> allmods = (List<Module>)
				 * moduleservice.getAllModule(); Map<Integer,Module> modulemap = new
				 * HashMap<Integer,Module>(); allmods.forEach(module->{
				 * modulemap.put(module.getId(),module); });
				 */
			  //get everything from role-module
//		  List<RoleModule> allrolemodules = (List<RoleModule>) rolemoduleservice.getAllRoleModule();
//		  //Initialise a map of role-module
//		  Map<Integer,List<Integer>> rolemodulemap = new HashMap<Integer,List<Integer>>();
//		  //converting rolemodules to a map
//		  allrolemodules.forEach(rm->{
//			  try {
//			  rolemodulemap.get(rm.getRoleid()).add(rm.getModuleid());
//			  }
//			  catch(Exception e)
//			  {
//				 List<Integer> values = new ArrayList<Integer>();
//				 values.add(rm.getModuleid());
//				  rolemodulemap.put(rm.getRoleid(),values);
//			  }
//		  });//O(n^2)
//		//get all the roleids
//		  List<Integer> roleids = userrolerepository.getRoleByUserID(userid);
//		  roleids.forEach(roleid->{
//			  List<ResponseRoleModule> responsemodules = new ArrayList<ResponseRoleModule>();
//
//			  Role roledetails = rolemap.get(roleid);
//			  List<Integer> moduleids = rolemodulemap.get(roleid);
//			  moduleids.forEach(moduleid->{
//				Module moduledetails = modulemap.get(moduleid); 
//			  });
//		  });//O(n^2)
		  
		  
		  
		  
	}
}
