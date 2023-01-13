package com.coolascode.app.rest;

import java.util.List;
import java.util.Optional;

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
import com.coolascode.app.dto.StaffDoctorDto;
import com.coolascode.app.dto.StaffDto;
import com.coolascode.app.entity.Doctor;
import com.coolascode.app.entity.Specialization;
import com.coolascode.app.entity.Staff;
import com.coolascode.app.service.IStaffService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StaffController {

	@Autowired
	public IStaffService staffservice;
	
	
	//Get all Employee
	@GetMapping("/staffs")
	public List<Staff> getAllCustomer() {	
		return (List<Staff>)staffservice.getStaff();
	}
	

	
	//Get all Employee
	@GetMapping("/spcl/{departmentId}&{specializationName}")
	public List<Specialization> specialization_Typeahead(@PathVariable int departmentId,@PathVariable String specializationName) {	
		return (List<Specialization>)staffservice.specialization_Typeahead(departmentId, specializationName);
	}

	//Get all Employee
	@GetMapping("/doctors/{departmentId}&{doctorName}")
	public List<StaffDoctorDto> get_doctor_department(@PathVariable int departmentId,@PathVariable String doctorName) {	
		return (List<StaffDoctorDto>)staffservice.get_doctor_department(departmentId, doctorName);
	}
	//Get Employee by Id
	@GetMapping("/staffs/{staffId}")
	public Optional<Staff> getStaff(@PathVariable int staffId) {
		
		return staffservice.getStaff(staffId);
	}
	

	//Get Employee by Id
	@GetMapping("/doctorlist/{staffId}")
	public Optional<StaffDoctorDto> getDoctor(@PathVariable int staffId) {
		
		return staffservice.getDoctor(staffId);
	}
	
	//Get Employee by Id
	@GetMapping("/stafflist")
	public List<StaffDto> Get_Staff_List() {
		return (List<StaffDto>)staffservice.Get_Staff_List();
		
	}
	//Add Employee
	@PostMapping("/emp")
	public void saveCustomer(@RequestBody Staff staff) {
		staffservice.saveStaff(staff);

	}

	
	//Add staffs
	@PostMapping("/staffssave")
	public int saveStaffDoctor(@RequestBody StaffDoctorDto staffdr) {
		System.out.println(staffdr);
		System.out.println("rtr");
		return staffservice.saveStaffDoctor(staffdr);
	}
	
	//Update Employee
	@PutMapping("/staffs")
	public void updateStaff(@RequestBody Staff staff) {
		staffservice.saveStaff(staff);

	}
	
	
	//Delete Employee
	@DeleteMapping("/staffdelete/{staffId}")
	public void deleteStaff(@PathVariable int staffId) {
		staffservice.deleteStaff(staffId);
	}
}
