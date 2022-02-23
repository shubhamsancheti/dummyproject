package org.demopro.dao.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RoleModuleRepository extends CrudRepository<RoleModuleEntity,Integer> {
	@Query("Select moduleid from RoleModuleEntity ure where roleid=:roleid")
	public List<Integer> getModuleByRoleID(@Param("roleid") Integer id);
	@Query("Select rme from RoleModuleEntity rme where rme.roleid IN (:roleids)")
	public List<RoleModuleEntity>  getRoleModuleListbyRoleIdList(@Param("roleids") List<Integer> roleIdList);
}
