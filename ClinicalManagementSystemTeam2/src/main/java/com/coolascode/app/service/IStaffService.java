package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import com.coolascode.app.dto.Dashboard;
import com.coolascode.app.dto.StaffDoctorDto;
import com.coolascode.app.dto.StaffDto;
import com.coolascode.app.entity.Doctor;
import com.coolascode.app.entity.Specialization;
import com.coolascode.app.entity.Staff;


public interface IStaffService {
	
	//List
	public List<Staff> getStaff();

	//List
	public List<Specialization> specialization_Typeahead(int departmentId,String specializationName);
	
	//Insert/Update
	public void saveStaff(Staff staff);
	
	//Insert/Update
	public int saveStaffDoctor(StaffDoctorDto staffdr);

	//Insert/Update
	public List<StaffDto> Get_Staff_List();

	//Insert/Update
	public List<StaffDoctorDto> get_doctor_department(int departmentId,String doctorName);
	
	//Search by id
	public Optional<Staff> getStaff(int staffId);
	

	//Search by id
	public Optional<StaffDoctorDto> getDoctor(int staffId);
	

	//Delete
	public void deleteStaff(int staffId);
}
