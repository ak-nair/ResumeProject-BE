package com.coolascode.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.IGenderRepo;
import com.coolascode.app.dao.IBloodGroup;
import com.coolascode.app.dao.IDepartmentRepo;
import com.coolascode.app.dao.IPatientCrudRepo;
import com.coolascode.app.dao.IPatientRepo;
import com.coolascode.app.dao.IRoleRepo;
import com.coolascode.app.dto.PatientDto;
import com.coolascode.app.entity.BloodGroup;
import com.coolascode.app.entity.Department;
import com.coolascode.app.entity.Gender;
import com.coolascode.app.entity.Patient;
import com.coolascode.app.entity.Role;

@Service
public class PatientServiceImple implements IPatientService {

	@Autowired
	private IPatientRepo patientRepo;
	
	@Autowired
	private IDepartmentRepo departRepo;
	
	@Autowired
	private IGenderRepo genderRepo;
	
	@Autowired
	private IPatientCrudRepo patientCrudRepo;
	
	@Autowired
	private IRoleRepo roleRepo;
	
	@Autowired
	private IBloodGroup bloodrepo;
	
	@Override
	public List<Patient> getPatient() {
		
		return (List<Patient>)patientCrudRepo.findAll();
	}
	
//	@Override
//	public List<Patient> getPatients() {
//		
//		return (List<Patient>)patientCrudRepo.findAll();
//	}
	@Override
	public int savePatient(PatientDto patient) {
		
		int result=patientRepo.savePatient(patient);
		return result;
	}

	@Override
	public List<Gender> getGender() {
		return (List<Gender>)genderRepo.findAll();
	}

	@Override
	public List<Department> getDepartment() {
		return (List<Department>)departRepo.getDepartment();
	}

	@Override
	public List<BloodGroup> getBloodGroup() {
		return (List<BloodGroup>)bloodrepo.getBloodGroup();
	}

	@Override
	public List<Role> getRole() {
		return (List<Role>)roleRepo.getRole();
	}

	@Override
	public List<PatientDto> GetAllPatient() {

		return (List<PatientDto>)patientCrudRepo.GetAllPatient();
	}

	@Override
	public void disablePatient(int patientId) {
		patientCrudRepo.deleteById(patientId);
		
	}


}
