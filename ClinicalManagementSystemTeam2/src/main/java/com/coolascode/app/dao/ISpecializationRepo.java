package com.coolascode.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.entity.Specialization;

@Repository
public interface ISpecializationRepo extends CrudRepository<Specialization, Integer> {
	
	@Query(value = "CALL Specialization_Typeahead(:departmentId,:specializationName);", nativeQuery = true)
	public List<Specialization> Specialization_Typeahead(int departmentId,String specializationName);
}
