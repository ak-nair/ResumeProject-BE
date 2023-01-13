package com.coolascode.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.entity.Role;

@Repository
public interface IRoleRepo extends CrudRepository<Role, Integer> {

	@Query(value = "CALL getRole();", nativeQuery = true)
	public List<Role> getRole();
}
