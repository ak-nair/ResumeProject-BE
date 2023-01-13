package com.coolascode.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.PatientDto;
import com.coolascode.app.entity.Patient;

@Repository
public interface IPatientCrudRepo extends CrudRepository<Patient, Integer> {
	

	@Query("SELECT new com.coolascode.app.dto.PatientDto( p.patientId,p.staffId,s.staffName,p.patientName,p.patientNo,p.mobile,p.email,p.genderId,"
		      + "g.genderName, p.bloodGroupId,b.bloodGroupName,p.dob,p.address,"
		      + "p.createdDate,p.modifiedDate,p.isActive)"
		      + "FROM Patient p "
		      + "INNER JOIN p.staff s "
		      + "INNER JOIN p.gender g "
		      + "INNER JOIN p.bloodGroup b ")
	public List<PatientDto> GetAllPatient();
	
	//@Query("Update Patient Set isActive=0 Where patientId=?1 ")

	@Query(value = "CALL disablepatient(:patientId);", nativeQuery = true)
	public Patient disablePatient(int patientId);
}
