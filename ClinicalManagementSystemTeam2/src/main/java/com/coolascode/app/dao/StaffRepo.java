package com.coolascode.app.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.Dashboard;
import com.coolascode.app.dto.StaffDoctorDto;
import com.coolascode.app.dto.StaffDto;
import com.coolascode.app.entity.Staff;

import java.util.Date;
import java.util.List;

@Repository
public interface StaffRepo extends CrudRepository<Staff, Integer> {
	

	
//	StaffDoctorDto staffdr=new StaffDoctorDto();
//	int sId=staffdr.staffId;
	//@Query(value = "CALL savestaffs();", nativeQuery = true)
	//public void saveStaffDoctor(StaffDoctorDto staffdr );

	//@Query(value = "CALL Get_Dashboard_Count();", nativeQuery = true)
//	@Query("SELECT new com.coolascode.app.dto.StaffDto( s.staffId,s.staffNo,s.staffName,s.mobile,s.email,s.genderId,g.genderName,s.address,"
//		      + "s.education, s.dob,s.dateOfJoining,s.createdDate,s.modifiedDate,"
//		      + "u.userName,u.password,u.roleId, d.departmentId,d.specializationId)"
//		      + "FROM Staff s "
//		      + "INNER JOIN s.gender g "
//		      + "INNER JOIN s.user u "
//		      + "RIGHT JOIN s.doctor d ")

	@Query("SELECT new com.coolascode.app.dto.StaffDoctorDto( s.staffName,d.doctorId,"
		      + "p.specializationName,d.consultationFees)"
		      + "FROM Staff s "
		      + "INNER JOIN s.doctor d "
		      + "INNER JOIN d.specialization p where d.departmentId=?1 and s.staffName Like CONCAT(?2, '%')")
	public List<Staff> disable(int departmentId,String staffName);
	
	@Query("SELECT new com.coolascode.app.dto.StaffDto( s.staffId,s.staffNo,s.staffName,s.mobile,s.email,s.genderId,g.genderName,s.address,"
		      + "s.education, s.dob,s.dateOfJoining,s.createdDate,s.modifiedDate,"
		      + "u.userName,u.password,u.roleId)"
		      + "FROM Staff s "
		      + "INNER JOIN s.gender g "
		      + "INNER JOIN s.user u  ")
	public List<StaffDto> Get_Staff_List();
	

	@Query("SELECT new com.coolascode.app.dto.StaffDoctorDto( s.staffName,d.doctorId,"
		      + "p.specializationName,d.consultationFees)"
		      + "FROM Staff s "
		      + "INNER JOIN s.doctor d "
		      + "INNER JOIN d.specialization p where d.departmentId=?1 and s.staffName Like CONCAT(?2, '%')")
	public List<StaffDoctorDto> get_doctor_department(int departmentId,String staffName);
	


}
