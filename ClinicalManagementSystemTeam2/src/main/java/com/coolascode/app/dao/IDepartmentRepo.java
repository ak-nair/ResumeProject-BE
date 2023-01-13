package com.coolascode.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.entity.Department;

@Repository
public interface IDepartmentRepo extends CrudRepository<Department, Integer> {


	@Query(value = "CALL getDepartment();", nativeQuery = true)
	public List<Department> getDepartment();
}
