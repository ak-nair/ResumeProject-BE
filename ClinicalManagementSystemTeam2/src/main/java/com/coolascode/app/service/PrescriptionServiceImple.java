package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.IPrescriptionRepo;
import com.coolascode.app.dao.LabTestPrescriptionRepo;
import com.coolascode.app.dao.MedicinePrescriptionRepo;
import com.coolascode.app.dao.PrescriptionsRepository;
import com.coolascode.app.dto.LabTestDTO;
import com.coolascode.app.dto.MedicineDTO;
import com.coolascode.app.dto.PrescriptionDto;
import com.coolascode.app.dto.PrescriptionHistoryDto;
import com.coolascode.app.entity.Prescription;

@Service
public class PrescriptionServiceImple implements IPrescriptionService {

	@Autowired
	private IPrescriptionRepo prerepo;
	
	@Autowired
	private PrescriptionsRepository prereposi;
	
	@Autowired
	private MedicinePrescriptionRepo medRepo;
	
	@Autowired
	private LabTestPrescriptionRepo labRepo;
	
	@Override
	public int savePrescription(PrescriptionDto prescription) {
		int result=prerepo.savePrescription(prescription);
		return result;
	}

	@Override
	public List<Prescription> getPrescription() {

		return (List<Prescription>)prereposi.findAll();
	}

	@Override
	public int saveMedicinePrescription(MedicineDTO medPrescription) {
		int result=prerepo.saveMedicinePrescription(medPrescription);
		return result;
	}

	@Override
	public int saveTestPrescription(LabTestDTO testPrescription) {
		int result=prerepo.saveTestPrescription(testPrescription);
		return result;
	}

	@Override
	public List<MedicineDTO> getAllMedicinePres(int prescriptionId) {
		
		return (List<MedicineDTO>)medRepo.getAllMedicinePres(prescriptionId);
	}

	@Override
	public List<LabTestDTO> getAllLabPres(int prescriptionId) {

		return (List<LabTestDTO>)labRepo.getAllLabPres(prescriptionId);
	}

	@Override
	public Optional<Prescription> Get_Prescription(int appointmentId) {
		return prereposi.Get_Prescription(appointmentId);
	}

	@Override
	public List<PrescriptionDto> getPres() {
		return prereposi.getPres();
	}

	@Override
	public List<PrescriptionHistoryDto> getPatientHistory(int patientId) {

		return (List<PrescriptionHistoryDto>)prereposi.getPatientHistory(patientId);
	}

}
