package org.demopro.service;

import java.util.Date;

import org.demopro.common.model.User;
import org.demopro.dao.model.UserEntity;

public class UserMapper {
		

	public User UeMaptoUser(UserEntity ue)
	{
	User u = new User();
	 u.setId(ue.getId());
	 u.setName(ue.getName());
	 u.setUser_id(ue.getUser_id());
	 u.setUsername(ue.getUsername());
	 u.setPassword(ue.getPassword());
	 u.setEmail(ue.getEmail()); 
	 u.setPhone_no1(ue.getPhone_no1());
	 u.setPhone_no2( ue.getPhone_no2());
	 u.setAddress(ue.getAddress());
	 u.setDate_of_birth(ue.getDate_of_birth());
	 u.setOrganization_id(ue.getOrganization_id());
	 u.setImage_url(ue.getImage_url());
	 u.setGender(ue.getGender());
	 u.setBlood_group( ue.getBlood_group());
	 u.setIs_active(ue.getIs_active());
	 u.setCreated_on(ue.getCreated_on());
	 u.setUpdated_on(ue.getUpdated_on());
	 u.setCreated_by(ue.getCreated_by());
	 u.setUpdated_by(ue.getUpdated_by());
	 u.setCpos_user_id( ue.getCpos_user_id());
	 u.setUuid(ue.getUuid());
	 u.setUser_type(ue.getUser_type());
	 return u;
	}
	public UserEntity UserMaptoUe(User u)
	{
	UserEntity  ue = new UserEntity();
	 ue.setId(u.getId());
	 ue.setName(u.getName());
	 ue.setUser_id(u.getUser_id());
	 ue.setUsername(u.getUsername());
	 ue.setPassword(u.getPassword());
	 ue.setEmail(u.getEmail()); 
	 ue.setPhone_no1(u.getPhone_no1());
	 ue.setPhone_no2( u.getPhone_no2());
	 ue.setAddress(u.getAddress());
	 ue.setDate_of_birth(u.getDate_of_birth());
	 ue.setOrganization_id(u.getOrganization_id());
	 ue.setImage_url(u.getImage_url());
	 ue.setGender(u.getGender());
	 ue.setBlood_group( u.getBlood_group());
	 ue.setIs_active(u.getIs_active());
	 ue.setCreated_on(u.getCreated_on());
	 ue.setUpdated_on(u.getUpdated_on());
	 ue.setCreated_by(u.getCreated_by());
	 ue.setUpdated_by(u.getUpdated_by());
	 ue.setCpos_user_id( u.getCpos_user_id());
	 ue.setUuid(u.getUuid());
	 ue.setUser_type(u.getUser_type());

	return ue;
	}
}
