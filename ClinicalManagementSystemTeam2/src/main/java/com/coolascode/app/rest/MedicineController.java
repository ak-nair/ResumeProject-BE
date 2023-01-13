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

import com.coolascode.app.dto.MedineAddDto;
import com.coolascode.app.dto.PatientDto;
import com.coolascode.app.entity.Medicine;
import com.coolascode.app.service.IMedicineService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MedicineController {

	@Autowired
	public IMedicineService medicineService;
	
	
	//Get all Employee
	@GetMapping("/medicines")
	public List<Medicine> getAllMedicine() {	
		return (List<Medicine>)medicineService.getMedicine();
	}
	
	//Get Employee by Id
	@GetMapping("/medicines/{medicineId}")
	public Optional<Medicine> getMedicine(@PathVariable int medicineId) {		
		return medicineService.getMedicine(medicineId);
	}
		
	//Add Employee
//	@PostMapping("/medicinesave")
//	public int saveMedicine(@RequestBody Medicine medicine) {
//		System.out.println(medicine);
//		return medicineService.saveMedicine(medicine);
//	}	
	

	@PostMapping("/medicinesave")
	public int saveMedicine(@RequestBody MedineAddDto medicine) {
		return medicineService.saveMedicine(medicine);
	}
	
	//Delete Employee
	@DeleteMapping("/medicinedelete/{medicineId}")
	public void deleteMedicine(@PathVariable int medicineId) {
		medicineService.deleteMedicine(medicineId);
	}
}
