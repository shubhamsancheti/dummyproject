package org.demopro.web;

import java.util.List;

import org.demopro.common.model.User;
import org.demopro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	@Autowired
	private UserService userservice;
	//read 
	@GetMapping("/User")
	public List<User> getAllUser()
	{
		return userservice.getAllUser();
	}
	@GetMapping("/User/{id}")
	public User getUserById(@PathVariable int id)
	{
		return userservice.getUserById(id);
	}
	//create 
	@PostMapping("/User")
	public String CreateUsers(@RequestBody User user)
	{
		userservice.createUser(user);
		return "yes";
	}
	//delete
	@DeleteMapping("/User/{id}")
	public String deleteUserById(@PathVariable int id)
	{
		userservice.deleteUser(id);
		return "yes";
	}
	//update
	@PutMapping("/User")
	public String updateUser(@RequestBody User u)
	{
		if(userservice.updateUser(u))
		{
			return ("record updated");
		}
		else 
		{
			return ("no record found");
		}
	}
}
