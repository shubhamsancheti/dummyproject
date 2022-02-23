package org.demopro.web;

import java.util.List;

import org.demopro.common.model.UserRole;
import org.demopro.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRoleController {
	@Autowired
	private UserRoleService UserRoleservice;
	//read 
	@GetMapping("/UserRole")
	public List<UserRole> getAllUserRole()
	{
		return UserRoleservice.getAllUserRole();
	}
	@GetMapping("/UserRole/{id}")
	public UserRole getUserRoleById(@PathVariable int id)
	{
		return UserRoleservice.getUserRoleById(id);
	}
	//create 
	@PostMapping("/UserRole")
	public String CreateUserRoles(@RequestBody List<UserRole> UserRoles)
	{
		UserRoleservice.createUserRoles(UserRoles);
		return "yes";
	}
	//delete
	@DeleteMapping("/UserRole/{id}")
	public String deleteUserRoleById(@PathVariable int id)
	{
		UserRoleservice.deleteUserRole(id);
		return "yes";
	}
	//update
	@PutMapping("/UserRole")
	public String updateUserRole(@RequestBody UserRole u)
	{
		if(UserRoleservice.updateUserRole(u))
		{
			return ("record updated");
		}
		else 
		{
			return ("no record found");
		}
	}
}
