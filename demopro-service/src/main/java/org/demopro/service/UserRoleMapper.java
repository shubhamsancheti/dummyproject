package org.demopro.service;

import java.util.Date;

import org.demopro.common.model.UserRole;
import org.demopro.dao.model.UserRoleEntity;

public class UserRoleMapper {
	public UserRole UreMaptoUserRole(UserRoleEntity ure)
	{
		UserRole userrole = new UserRole();
		
		userrole.setId(ure.getId());
		userrole.setUser_id(ure.getUser_id()); 
		userrole.setRole_id(ure.getRole_id()) ;
		userrole.setIs_active(ure.getIs_active()) ;
		userrole.setCreated_on(ure.getCreated_on()) ;
		userrole.setUpdated_on(ure.getUpdated_on()) ;
		userrole.setCreated_by (ure.getCreated_by()) ;
		return userrole;
		
	}
	public UserRoleEntity UserRoleMaptoUre(UserRole ur)
	{
		UserRoleEntity userentity = new UserRoleEntity();
		userentity.setId(ur.getId());
		userentity.setUser_id(ur.getUser_id()); 
		userentity.setRole_id(ur.getRole_id()) ;
		userentity.setIs_active(ur.getIs_active()) ;
		userentity.setCreated_on(ur.getCreated_on()) ;
		userentity.setUpdated_on(ur.getUpdated_on()) ;
		userentity.setCreated_by (ur.getCreated_by());
		return userentity;
	}
}
