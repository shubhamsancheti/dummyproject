package org.demopro.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.demopro.common.model.Role;
import org.demopro.common.model.RoleModule;
import org.demopro.dao.model.RoleModuleEntity;
import org.demopro.dao.model.RoleModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleModuleService {

	@Autowired
	private RoleModuleRepository roleModuleRepository;
	private RoleModuleMapper rm=new RoleModuleMapper();
	public List<RoleModule> getAllRoleModule()   
	{  
	List<RoleModule> RoleModulesList = new ArrayList<RoleModule>();
	
	   Iterable<RoleModuleEntity> RoleModules = roleModuleRepository.findAll();
       RoleModules.forEach((p) -> {
           RoleModulesList.add(rm.RmeMaptoRoleModule(p));
       });
       return RoleModulesList;
	
	}  
	public RoleModule getRoleModuleById(int id)
	{	
		return rm.RmeMaptoRoleModule(roleModuleRepository.findById(id).get());
		
	      
	}
	public void createRoleModules(List<RoleModule> RoleModules)
	{
	RoleModules.stream().forEach((u)->{
		roleModuleRepository.save(rm.RoleModuleMaptoRme(u));
	});
	}

	public void deleteRoleModule(int id)
	{
		roleModuleRepository.deleteById(id);
	}
	public boolean updateRoleModule(RoleModule u)
	{
		//to check even if it exits or not 
		if(roleModuleRepository.findById(u.getId()).isPresent())
		{
			roleModuleRepository.save(rm.RoleModuleMaptoRme(u));	
			return true;
		}
		else 
		{
			return false;
		}
	}
	public List<Integer> getModuleByRoleID(int roleid)
	{
		return roleModuleRepository.getModuleByRoleID(roleid);
	}
	public Map<Integer,List<Integer>> getRoleModuleListMapByRoleIdList(List<Integer> roleidList)
	{
		List<RoleModuleEntity> rolemoduleentitylist = roleModuleRepository.getRoleModuleListbyRoleIdList(roleidList);
		//return rolemoduleentitylist.stream().collect(Collectors.groupingBy(i->i.getRoleid(),Collectors.mapping(i->i.));
		Map<Integer,List<Integer>> RoleModuleListMap  = new HashMap<>();
		rolemoduleentitylist.forEach(rm->{
			  try {
				  RoleModuleListMap.get(rm.getRoleid()).add(rm.getModuleid());
			  }
			  catch(Exception e)
			  {
				 List<Integer> values = new ArrayList<Integer>();
				 values.add(rm.getModuleid());
				 RoleModuleListMap.put(rm.getRoleid(),values);
			  }
		  });
		return RoleModuleListMap;
	}
}
