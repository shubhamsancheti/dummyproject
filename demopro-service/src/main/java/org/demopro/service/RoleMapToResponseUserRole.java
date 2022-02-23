package org.demopro.service;

import org.demopro.common.model.Module;
import org.demopro.common.model.ResponseRoleModule;
import org.demopro.common.model.ResponseUserRole;
import org.demopro.common.model.Role;

public class RoleMapToResponseUserRole {
	public ResponseUserRole ModmaptoResponseMod(Role r)
	{
		ResponseUserRole responsemodule = new ResponseUserRole();
		responsemodule.setRoleId(r.getId());
		responsemodule.setRoleName(r.getName());
		responsemodule.setRoleDescription(r.getDescription());
		return responsemodule;
	}
	public Role ResponseModmaptoMod(ResponseUserRole responsemodule)
	{
		Role r = new Role();
		r.setId(responsemodule.getRoleId());
		r.setName(responsemodule.getRoleName());
		r.setDescription(responsemodule.getRoleDescription());
		return r;
	}
}
