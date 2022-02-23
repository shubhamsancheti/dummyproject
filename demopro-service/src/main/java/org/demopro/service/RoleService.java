package org.demopro.service;

import java.util.ArrayList;
import java.util.List;

import org.demopro.common.model.Role;
import org.demopro.dao.model.RoleEntity;
import org.demopro.dao.model.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	private RoleMapper rm=new RoleMapper();
	public List<Role> getAllRole()   
	{  
	List<Role> RolesList = new ArrayList<Role>();
	
	   Iterable<RoleEntity> Roles = roleRepository.findAll();
       Roles.forEach((p) -> {
           RolesList.add(rm.ReMaptoRole(p));
       });
       return RolesList;
	
	}  
	public Role getRoleById(int id)
	{	
		return rm.ReMaptoRole(roleRepository.findById(id).get());
		
	      
	}
	public void createRoles(List<Role> Roles)
	{
	Roles.stream().forEach((u)->{
		roleRepository.save(rm.RoleMaptoRe(u));
	});
	}

	public void deleteRole(int id)
	{
		roleRepository.deleteById(id);
	}
	public boolean updateRole(Role u)
	{
		//to check even if it exits or not 
		if(roleRepository.findById(u.getId()).isPresent())
		{
			roleRepository.save(rm.RoleMaptoRe(u));	
			return true;
		}
		else 
		{
			return false;
		}
	}
}
