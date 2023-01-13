package com.coolascode.app.dao;

import com.coolascode.app.dto.LabTestDTO;
import com.coolascode.app.dto.MedicineDTO;
import com.coolascode.app.dto.PrescriptionDto;

public interface IPrescriptionRepo {

	public int savePrescription(PrescriptionDto prescription);
	

	public int saveMedicinePrescription(MedicineDTO medprescription);

	public int saveTestPrescription(LabTestDTO testprescription);
}
