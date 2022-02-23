package org.demopro.dao.model;
//import java.util.List;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends CrudRepository<RoleEntity,Integer> {
	@Query("Select re from RoleEntity re where re.id in (:roleid)")
	public List<RoleEntity> getRolesbyRoleIDList(@Param("roleid") List<Integer> roleidlist);
}
