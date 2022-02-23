package org.demopro.web;

import java.util.List;

import org.demopro.common.model.RoleModule;
import org.demopro.service.RoleModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleModuleController {

	@Autowired
	private RoleModuleService RoleModuleservice;
	//read 
	@GetMapping("/RoleModule")
	public List<RoleModule> getAllRoleModule()
	{
		return RoleModuleservice.getAllRoleModule();
	}
	@GetMapping("/RoleModule/{id}")
	public RoleModule getRoleModuleById(@PathVariable int id)
	{
		return RoleModuleservice.getRoleModuleById(id);
	}
	//create 
	@PostMapping("/RoleModule")
	public String CreateRoleModules(@RequestBody List<RoleModule> RoleModules)
	{
		RoleModuleservice.createRoleModules(RoleModules);
		return "yes";
	}
	//delete
	@DeleteMapping("/RoleModule/{id}")
	public String deleteRoleModuleById(@PathVariable int id)
	{
		RoleModuleservice.deleteRoleModule(id);
		return "yes";
	}
	//update
	@PutMapping("/RoleModule")
	public String updateRoleModule(@RequestBody RoleModule u)
	{
		if(RoleModuleservice.updateRoleModule(u))
		{
			return ("record updated");
		}
		else 
		{
			return ("no record found");
		}
	}
}
