package com.coolascode.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coolascode.app.dto.LabDto;
import com.coolascode.app.entity.Labtest;
import com.coolascode.app.service.ILabService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LabTestController {

	@Autowired
	public ILabService labService;
	
	
	//Get all Employee
	@GetMapping("/labtests")
	public List<Labtest> getAllLabTest() {	
		return (List<Labtest>)labService.getLabTest();
	}
	
	//Get Employee by Id
	@GetMapping("/labs/{testId}")
	public Optional<Labtest> getLabTest(@PathVariable int testId) {		
		return labService.getLabTest(testId);
	}
		
	//Add Employee
	@PostMapping("/labs")
	public int saveLabTest(@RequestBody LabDto labtest) {
		return labService.saveLabTest(labtest);
	}	
	
	//Delete Employee
	@DeleteMapping("/labtestdelete/{testId}")
	public void deleteLabTest(@PathVariable int testId) {
		labService.deleteLabTest(testId);
	}
}
