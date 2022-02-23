package org.demopro.service;

import org.demopro.dao.model.ModuleEntity;

import java.util.Date;

import org.demopro.common.model.Module;

public class ModuleMapper {
	public Module MeMaptoModule(ModuleEntity me)
	{
	Module module = new Module();
	module.setId(me.getId()); 
	module.setApplication_id(me.getApplication_id()) ;
	module.setName(me.getName());
	module.setKey(me.getKey());
	module.setIs_active(me.getIs_active());
	module.setStart_date(me.getStart_date());
	module.setCreated_on(me.getCreated_on());
	module.setUpdated_on(me.getUpdated_on()) ;
	module.setCreated_by(me.getCreated_by());
	return module;
	}
	public ModuleEntity ModuleMaptoRe(Module m)
	{
	ModuleEntity  me = new ModuleEntity();
	me.setId(m.getId()); 
	me.setApplication_id(m.getApplication_id()) ;
	me.setName(m.getName());
	me.setKey(m.getKey());
	me.setIs_active(m.getIs_active());
	me.setStart_date(m.getStart_date());
	me.setCreated_on(m.getCreated_on());
	me.setUpdated_on(m.getUpdated_on()) ;
	me.setCreated_by(m.getCreated_by());
	return me;
	}
}

