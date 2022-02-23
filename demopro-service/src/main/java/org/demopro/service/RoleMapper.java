package org.demopro.service;




import java.util.Date;
import java.util.List;

import org.demopro.common.model.Module;
import org.demopro.common.model.Role;
import org.demopro.dao.model.RoleEntity;



public class RoleMapper {
	public Role ReMaptoRole(RoleEntity re)
	{
	Role role = new Role();
	 
		role.setId(re.getId());
		role.setApplication_id(re.getApplication_id()); 
		role.setName(re.getName());
		role.setDescription( re.getDescription());
		role.setOrganization_id(re.getOrganization_id());
		role.setIs_active(re.getIs_active()); 
		role.setStart_date(re.getStart_date());
	    role.setCreated_on(re.getUpdated_on());
		role.setCreated_by(re.getCreated_by());
		role.setUpdated_by (re.getUpdated_by()); 
		role.setUpdated_on(re.getUpdated_on());
	return role;
	}
	public RoleEntity RoleMaptoRe(Role role)
	{
	RoleEntity  re = new RoleEntity();

	 
	re.setId(role.getId());
	re.setApplication_id(role.getApplication_id()); 
	re.setName(role.getName());
	re.setDescription( role.getDescription());
	re.setOrganization_id(role.getOrganization_id());
	re.setIs_active(role.getIs_active()); 
	re.setStart_date(role.getStart_date());
    re.setCreated_on(role.getCreated_on());
	re.setCreated_by(role.getCreated_by());
	re.setUpdated_by (role.getUpdated_by()); 
	re.setUpdated_on(role.getUpdated_on());
	return re;
	}
}
