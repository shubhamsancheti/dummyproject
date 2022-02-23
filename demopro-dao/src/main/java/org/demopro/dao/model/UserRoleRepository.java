package org.demopro.dao.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface UserRoleRepository extends CrudRepository<UserRoleEntity, Integer> {
	@Query("Select role_id from UserRoleEntity ure where user_id=:user_id")
	public List<Integer> getRoleByUserID(@Param("user_id") Integer id);
	
}
