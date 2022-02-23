package org.demopro.web;

import java.util.List;

import org.demopro.common.model.Role;
import org.demopro.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RoleController {
	
		@Autowired
		private RoleService roleservice;
		//read 
		@GetMapping("/Role")
		public List<Role> getAllRole()
		{
			return roleservice.getAllRole();
		}
		@GetMapping("/Role/{id}")
		public Role getRoleById(@PathVariable int id)
		{
			return roleservice.getRoleById(id);
		}
		//create 
		@PostMapping("/Role")
		public String CreateRoles(@RequestBody List<Role> Roles)
		{
			roleservice.createRoles(Roles);
			return "yes";
		}
		//delete
		@DeleteMapping("/Role/{id}")
		public String deleteRoleById(@PathVariable int id)
		{
			roleservice.deleteRole(id);
			return "yes";
		}
		//update
		@PutMapping("/Role")
		public String updateRole(@RequestBody Role u)
		{
			if(roleservice.updateRole(u))
			{
				return ("record updated");
			}
			else 
			{
				return ("no record found");
			}
		}
}
