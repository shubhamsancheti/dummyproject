package org.demopro.service;

import java.util.ArrayList;

//import java.util.Iterator;
import java.util.List;
//import java.util.Optional;

import org.demopro.common.model.User;
import org.demopro.dao.model.UserEntity;
import org.demopro.dao.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	private UserMapper um=new UserMapper();
	public List<User> getAllUser()   
	{  
	List<User> UsersList = new ArrayList<User>();
	
	   Iterable<UserEntity> Users = userRepository.findAll();
       Users.forEach((p) -> {
           UsersList.add(um.UeMaptoUser(p));
       });
       return UsersList;
	
	}  
	public User getUserById(int id)
	{	
		return um.UeMaptoUser(userRepository.findById(id).get());
		
	      
	}
	public void createUser(User user)
	{
		/*
		 * users.stream().forEach((u)->{ userRepository.save(um.UserMaptoUe(u)); });
		 */
		userRepository.save(um.UserMaptoUe(user));
	}

	public void deleteUser(int id)
	{
		userRepository.deleteById(id);
	}
	public boolean updateUser(User u)
	{
		//to check even if it exits or not 
		if(userRepository.findById(u.getId()).isPresent())
		{
			userRepository.save(um.UserMaptoUe(u));	
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}
