package org.demopro.service;

import org.demopro.common.model.ResponseUserData;
import org.demopro.common.model.ResponseUserRole;
import org.demopro.common.model.Role;
import org.demopro.common.model.User;

public class UserMaptoResponseUser {
	public ResponseUserData UsermaptoResponseUser(User u)
	{
		ResponseUserData responseuser = new ResponseUserData();
		responseuser.setName(u.getName());
		responseuser.setAddress(u.getAddress());
		responseuser.setUsername(u.getUsername());
		responseuser.setEmail(u.getEmail());
		return responseuser;
	}
	public User ResponseModmaptoMod(ResponseUserData responseuser)
	{
		User u = new User();
		u.setName(responseuser.getName());
		u.setAddress(responseuser.getAddress());
		u.setUsername(responseuser.getUsername());
		u.setEmail(responseuser.getEmail());
		return u;
	}
}
