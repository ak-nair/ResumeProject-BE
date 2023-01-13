package com.coolascode.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coolascode.app.dto.LabTestDTO;
import com.coolascode.app.dto.MedicineDTO;
import com.coolascode.app.dto.PrescriptionDto;
import com.coolascode.app.dto.PrescriptionHistoryDto;
import com.coolascode.app.entity.Prescription;
import com.coolascode.app.service.IPrescriptionService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PrescriptionController {


	@Autowired
	public IPrescriptionService preservice;
	

	//Add Employee
	@GetMapping("/prescription")
	public List<Prescription> getPrescription() {	
		return (List<Prescription>)preservice.getPrescription();
	}
	
	//Add Employee
	@GetMapping("/prescall")
	public List<PrescriptionDto> getPres() {	
		return (List<PrescriptionDto>)preservice.getPres();
	}

	@GetMapping("/medpresc/{prescriptionId}")
	public List<MedicineDTO> getMedicicinePres(@PathVariable int prescriptionId) {	
		return (List<MedicineDTO>)preservice.getAllMedicinePres(prescriptionId);
	}

	@GetMapping("/labpresc/{prescriptionId}")
	public List<LabTestDTO> getAllLabPres(@PathVariable int prescriptionId) {	
		return (List<LabTestDTO>)preservice.getAllLabPres(prescriptionId);
	}

	@GetMapping("/historyappo/{patientId}")
	public List<PrescriptionHistoryDto> getPatientHistory(@PathVariable int patientId) {	
		return (List<PrescriptionHistoryDto>)preservice.getPatientHistory(patientId);
	}
	
	@PostMapping("/prescription")
	public int savePrescription(@RequestBody PrescriptionDto prescription) {
		return preservice.savePrescription(prescription);
	}	

	@PostMapping("/medprescription")
	public int saveMedicinePrescription(@RequestBody MedicineDTO medPrescription) {
		System.out.println(medPrescription);
		System.out.println("medPrescription");
		return preservice.saveMedicinePrescription(medPrescription);
	}	

	@PostMapping("/testprescription")
	public int saveTestPrescription(@RequestBody LabTestDTO testPrescription) {
		return preservice.saveTestPrescription(testPrescription);
	}	
	
	//Get employee by id
	@GetMapping("/presc/{appointmentId}")
	public Optional <Prescription> Get_Prescription(@PathVariable int appointmentId) {
		return preservice.Get_Prescription(appointmentId);
	}
}

