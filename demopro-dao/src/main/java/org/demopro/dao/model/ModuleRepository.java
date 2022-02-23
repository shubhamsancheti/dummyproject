package org.demopro.dao.model;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ModuleRepository  extends CrudRepository<ModuleEntity,Integer> {
	@Query("Select me from ModuleEntity me where id in (:moduleid)")
	public List<ModuleEntity> getModulesbyModuleIDList(@Param("moduleid") List<Integer> moduleidlist);
}
