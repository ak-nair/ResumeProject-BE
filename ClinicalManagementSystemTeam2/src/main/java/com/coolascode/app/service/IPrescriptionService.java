package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import com.coolascode.app.dto.LabTestDTO;
import com.coolascode.app.dto.MedicineDTO;
import com.coolascode.app.dto.PrescriptionDto;
import com.coolascode.app.dto.PrescriptionHistoryDto;
import com.coolascode.app.entity.Department;
import com.coolascode.app.entity.Prescription;

public interface IPrescriptionService {
	
	//List
	public List<Prescription> getPrescription();

	//List
	public List<MedicineDTO> getAllMedicinePres(int prescriptionId);

	//List
	public List<LabTestDTO> getAllLabPres(int prescriptionId);

	//List
	public List<PrescriptionDto> getPres();

	//List
	public List<PrescriptionHistoryDto> getPatientHistory(int patientId);
	
	//Insert/Update
	public int savePrescription(PrescriptionDto prescription);
	
	//Insert/Update
	public int saveMedicinePrescription(MedicineDTO medPrescription);
	
	//Insert/Update
	public int saveTestPrescription(LabTestDTO testPrescription);

	public Optional <Prescription> Get_Prescription(int appointmentId);

}
