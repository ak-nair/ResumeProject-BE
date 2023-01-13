package com.coolascode.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.StaffDoctorDto;
import com.coolascode.app.entity.Department;
import com.coolascode.app.entity.Doctor;
import com.coolascode.app.entity.Specialization;
import com.coolascode.app.entity.Staff;

@Repository
public interface DoctorRepo extends CrudRepository<Doctor, Integer> {
	
	@Query("SELECT new com.coolascode.app.dto.StaffDoctorDto(d.doctorId, d.departmentId, "
			      + "d.specializationId,s.specializationName,d.consultationFees)"
			      + "FROM Doctor d INNER JOIN  d.specialization s "
			      + "Where d.staffId=?1 ")
	public Optional<StaffDoctorDto> getDoctor(int staffId);

}
