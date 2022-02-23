package org.demopro.web;

import java.util.List;

import org.demopro.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.demopro.common.model.Module;

@RestController
public class ModuleController {
	@Autowired
	private ModuleService moduleservice;
	//read 
	@GetMapping("/Module")
	public List<Module> getAllModule()
	{
		return moduleservice.getAllModule();
	}
	@GetMapping("/Module/{id}")
	public Module getModuleById(@PathVariable int id)
	{
		return moduleservice.getModuleById(id);
	}
	//create 
	@PostMapping("/Module")
	public String CreateModules(@RequestBody List<Module> Modules)
	{
		moduleservice.createModules(Modules);
		//System.out.println(Modules);
		return "yes";
	}
	//delete
	@DeleteMapping("/Module/{id}")
	public String deleteModuleById(@PathVariable int id)
	{
		moduleservice.deleteModule(id);
		return "yes";
	}
	//update
	@PutMapping("/Module")
	public String updateModule(@RequestBody Module u)
	{
		if(moduleservice.updateModule(u))
		{
			return ("record updated");
		}
		else 
		{
			return ("no record found");
		}
	}
}
