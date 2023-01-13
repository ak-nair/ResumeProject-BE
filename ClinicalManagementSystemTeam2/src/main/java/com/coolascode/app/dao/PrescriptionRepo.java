package com.coolascode.app.dao;


import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.LabTestDTO;
import com.coolascode.app.dto.MedicineDTO;
import com.coolascode.app.dto.PrescriptionDto;
import com.coolascode.app.entity.Prescription;

@Repository
public class PrescriptionRepo implements IPrescriptionRepo {

private final static String Prescription_Proc = "Save_Prescription_Appointment";

private final static String medicinepre_proc = "Save_medicinePre";

private final static String Testpre_proc = "save_testpre";
    @Autowired
    private EntityManager entityManager;

	@Override
	public int savePrescription(PrescriptionDto prescription) {

		 StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery( Prescription_Proc);
	        
	        query.registerStoredProcedureParameter("prescriptionId", Integer.class, ParameterMode.IN); 
	        query.registerStoredProcedureParameter("appointmentId", Integer.class, ParameterMode.IN); 
	        query.registerStoredProcedureParameter("diagnosis", String.class, ParameterMode.IN); 
	        query.registerStoredProcedureParameter("ReturnId", Integer.class, ParameterMode.OUT);
	        
	    	query.setParameter("prescriptionId", prescription.getPrescriptionId());
			query.setParameter("appointmentId", prescription.getAppointmentId());
			query.setParameter("diagnosis", prescription.getDiagnosis());
			
	        int count = ((Number) query.getOutputParameterValue("ReturnId")).intValue();
	    	return count;
	}

	@Override
	public int saveMedicinePrescription(MedicineDTO medicineprescription) {
		StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery( medicinepre_proc);
        
        query.registerStoredProcedureParameter("medicineprescriptionId", Integer.class, ParameterMode.IN); 
        query.registerStoredProcedureParameter("medicineId", Integer.class, ParameterMode.IN); 
        query.registerStoredProcedureParameter("course", String.class, ParameterMode.IN); 
        query.registerStoredProcedureParameter("medicineIntervalId", Integer.class, ParameterMode.IN); 
        query.registerStoredProcedureParameter("prescriptionId", Integer.class, ParameterMode.IN); 
        query.registerStoredProcedureParameter("ReturnId", Integer.class, ParameterMode.OUT);
        
    	query.setParameter("medicineprescriptionId", medicineprescription.getMedicineprescriptionId());
		query.setParameter("medicineId", medicineprescription.getMedicineId());
		query.setParameter("course", medicineprescription.getCourse());
		query.setParameter("medicineIntervalId", medicineprescription.getMedicineIntervalId());
		query.setParameter("prescriptionId", medicineprescription.getPrescriptionId());
		
        int count = ((Number) query.getOutputParameterValue("ReturnId")).intValue();
    	return count;
	}

	@Override
	public int saveTestPrescription(LabTestDTO testprescription) {
StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery( Testpre_proc);
        
        query.registerStoredProcedureParameter("testprescriptionId", Integer.class, ParameterMode.IN); 
        query.registerStoredProcedureParameter("testId", Integer.class, ParameterMode.IN); 
        query.registerStoredProcedureParameter("prescriptionId", Integer.class, ParameterMode.IN); 
        query.registerStoredProcedureParameter("ReturnId", Integer.class, ParameterMode.OUT);
        
    	query.setParameter("testprescriptionId", testprescription.getTestprescriptionId());
		query.setParameter("testId", testprescription.getTestId());
		query.setParameter("prescriptionId", testprescription.getPrescriptionId());
		
        int count = ((Number) query.getOutputParameterValue("ReturnId")).intValue();
    	return count;
	}
}
