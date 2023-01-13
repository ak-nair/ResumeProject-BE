package com.coolascode.app.service;

import java.util.List;

import com.coolascode.app.dto.PatientDto;
import com.coolascode.app.entity.BloodGroup;
import com.coolascode.app.entity.Department;
import com.coolascode.app.entity.Gender;
import com.coolascode.app.entity.Patient;
import com.coolascode.app.entity.Role;

public interface IPatientService {

	//List
	public List<Patient> getPatient();

	//List
	public List<PatientDto> GetAllPatient();
	
	//List
	public List<Gender> getGender();

	//List
	public List<Role> getRole();
	
	//List
	public List<Department> getDepartment();


	//List
	public List<BloodGroup> getBloodGroup();
	
	//Insert/Update
	public int savePatient(PatientDto patient);
	
	//Delete
	public void disablePatient(int patientId);

}
