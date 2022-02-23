package org.demopro.service;

import org.demopro.common.model.ResponseRoleModule;
import org.demopro.common.model.Module;
public class ModuleMaptoResponseModule {
			public ResponseRoleModule ModmaptoResponseMod(Module m)
			{
				ResponseRoleModule responsemodule = new ResponseRoleModule();
				responsemodule.setModuleId(m.getId());
				responsemodule.setModuleName(m.getName());
				return responsemodule;
			}
			public Module ResponseModmaptoMod(ResponseRoleModule responsemodule)
			{
				Module m = new Module();
				m.setId(responsemodule.getModuleId());
				m.setName(responsemodule.getModuleName());
				return m;
			}
			
}
