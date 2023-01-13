package com.coolascode.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.entity.BloodGroup;

@Repository
public interface IBloodGroup extends CrudRepository<BloodGroup, Integer> {


	@Query(value = "CALL getBloodGroup();", nativeQuery = true)
	public List<BloodGroup> getBloodGroup();

}
