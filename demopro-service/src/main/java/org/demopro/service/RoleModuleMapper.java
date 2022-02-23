package org.demopro.service;

import org.demopro.common.model.RoleModule;
import org.demopro.dao.model.RoleModuleEntity;

public class RoleModuleMapper {
	public RoleModule RmeMaptoRoleModule( RoleModuleEntity rme)
	{
		RoleModule rm = new RoleModule();

		rm.setId(rme.getId());
		rm.setRoleid(rme.getRoleid());
		rm.setModuleid(rme.getModuleid());
		rm.setIs_active(rme.getIs_active());
		rm.setCreated_by(rme.getCreated_by());
		rm.setCreated_on(rme.getCreated_on());
		rm.setUpdated_on(rme.getUpdated_on());
		return rm;
	}
	public RoleModuleEntity RoleModuleMaptoRme(RoleModule rm)
	{
		RoleModuleEntity rme = new RoleModuleEntity();
		
		rme.setId(rm.getId());
		rme.setRoleid(rm.getRoleid());
		rme.setModuleid(rm.getModuleid());
		rme.setIs_active(rm.getIs_active());
		rme.setCreated_by(rm.getCreated_by());
		rme.setCreated_on(rm.getCreated_on());
		rme.setUpdated_on(rm.getUpdated_on());
		return rme;
	}
}
