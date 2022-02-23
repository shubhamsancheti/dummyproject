package org.demopro.service;

import java.util.ArrayList;
import java.util.List;

import org.demopro.dao.model.ModuleEntity;
import org.demopro.dao.model.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.demopro.common.model.Module;



@Service
public class ModuleService {
	@Autowired
	private ModuleRepository moduleRepository;
	private ModuleMapper mm=new ModuleMapper();
	public List<Module> getAllModule()   
	{  
	List<Module> ModulesList = new ArrayList<Module>();
	
	   Iterable<ModuleEntity> Modules = moduleRepository.findAll();
       Modules.forEach((p) -> {
           ModulesList.add(mm.MeMaptoModule(p));
       });
       return ModulesList;
	
	}  
	public Module getModuleById(int id)
	{	
		return mm.MeMaptoModule(moduleRepository.findById(id).get());
		
	      
	}
	public void createModules(List<Module> Modules)
	{
		
		  Modules.stream().forEach((u)->{
			 moduleRepository.save(mm.ModuleMaptoRe(u));
			  //System.out.println(mm.ModuleMaptoRe(u));
		  });
		 
		
	}

	public void deleteModule(int id)
	{
		moduleRepository.deleteById(id);
	}
	public boolean updateModule(Module u)
	{
		//to check even if it exits or not 
		if(moduleRepository.findById(u.getId()).isPresent())
		{
			moduleRepository.save(mm.ModuleMaptoRe(u));	
			return true;
		}
		else 
		{
			return false;
		}
	}
}
