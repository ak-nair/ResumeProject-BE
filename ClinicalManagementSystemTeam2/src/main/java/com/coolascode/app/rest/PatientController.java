package com.coolascode.app.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coolascode.app.dto.PatientDto;
import com.coolascode.app.entity.BloodGroup;
import com.coolascode.app.entity.Department;
import com.coolascode.app.entity.Gender;
import com.coolascode.app.entity.Patient;
import com.coolascode.app.entity.Role;
import com.coolascode.app.service.IPatientService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PatientController {

	@Autowired
	public IPatientService patientService;
	
	
	//Get all Patient
	@GetMapping("/patients")
	public List<Patient> getAllCustomer() {	
		return (List<Patient>)patientService.getPatient();
	}

	//Get all Patient
	@GetMapping("/patientall")
	public List<PatientDto> GetAllPatient() {	
		return (List<PatientDto>)patientService.GetAllPatient();
	}

	//Get all Patient
	@GetMapping("/departments")
	public List<Department> getDepartment() {	
		return (List<Department>)patientService.getDepartment();
	}

	//Get all Patient
	@GetMapping("/gender")
	public List<Gender> getGender() {	
		return (List<Gender>)patientService.getGender();
	}

	//Get all Patient
	@GetMapping("/role")
	public List<Role> getRole() {	
		return (List<Role>)patientService.getRole();
	}

	//Get all Patient
	@GetMapping("/bloodgroups")
	public List<BloodGroup> getBloodGroup() {	
		return (List<BloodGroup>)patientService.getBloodGroup();
	}
	
	//Add Patient
	@PostMapping("/patients")
	public int savePatient(@RequestBody PatientDto patient) {
		return patientService.savePatient(patient);
	}
	

	
	//Delete Employee
	@DeleteMapping("/patientdelete/{patientId}")
	public void disablePatient(@PathVariable int patientId) {
		 patientService.disablePatient(patientId);
	}
}
