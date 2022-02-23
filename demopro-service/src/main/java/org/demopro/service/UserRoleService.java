package org.demopro.service;

import java.util.ArrayList;
import java.util.List;

import org.demopro.common.model.UserRole;
import org.demopro.dao.model.UserRoleEntity;
import org.demopro.dao.model.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService {
	@Autowired
	private UserRoleRepository userRoleRepository;
	private UserRoleMapper um=new UserRoleMapper();
	public List<UserRole> getAllUserRole()   
	{  
	List<UserRole> UserRolesList = new ArrayList<UserRole>();
	
	   Iterable<UserRoleEntity> UserRoles = userRoleRepository.findAll();
       UserRoles.forEach((p) -> {
           UserRolesList.add(um.UreMaptoUserRole(p));
       });
       return UserRolesList;
	
	}  
	public UserRole getUserRoleById(int id)
	{	
		return um.UreMaptoUserRole(userRoleRepository.findById(id).get());
		
	      
	}
	public void createUserRoles(List<UserRole> UserRoles)
	{
	UserRoles.stream().forEach((u)->{
		userRoleRepository.save(um.UserRoleMaptoUre(u));
	});
	}

	public void deleteUserRole(int id)
	{
		userRoleRepository.deleteById(id);
	}
	public boolean updateUserRole(UserRole u)
	{
		//to check even if it exits or not 
		if(userRoleRepository.findById(u.getId()).isPresent())
		{
			userRoleRepository.save(um.UserRoleMaptoUre(u));	
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}
