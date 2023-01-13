package com.coolascode.app.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.PatientDto;
import com.coolascode.app.entity.Patient;

@Repository
public class PatientRepo implements IPatientRepo{
private final static String Patient_Proc = "Save_Patient";
    
    @Autowired
    private EntityManager entityManager;
    
	@Override
	public int savePatient(PatientDto patient) {
		
	        StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery( Patient_Proc);
	        
	        query.registerStoredProcedureParameter("patientId", Integer.class, ParameterMode.IN); 
	        query.registerStoredProcedureParameter("staffId", Integer.class, ParameterMode.IN); 
	        query.registerStoredProcedureParameter("patientName", String.class, ParameterMode.IN); 
	        query.registerStoredProcedureParameter("patientNo", String.class, ParameterMode.IN); 
	        query.registerStoredProcedureParameter("mobile", String.class, ParameterMode.IN); 
	        query.registerStoredProcedureParameter("email", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("genderId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("bloodGroupId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("dob", Date.class, ParameterMode.IN); 
	        query.registerStoredProcedureParameter("address", String.class, ParameterMode.IN); 
	        query.registerStoredProcedureParameter("ReturnId", Integer.class, ParameterMode.OUT);
	        
	    	query.setParameter("patientId", patient.getPatientId());
			query.setParameter("staffId", patient.getStaffId());
			query.setParameter("patientName", patient.getPatientName());
			query.setParameter("patientNo", patient.getPatientNo());
			query.setParameter("mobile", patient.getMobile());
			query.setParameter("email", patient.getEmail());
			query.setParameter("genderId", patient.getGenderId());
			query.setParameter("bloodGroupId", patient.getBloodGroupId());
			query.setParameter("dob", patient.getDob());
			query.setParameter("address", patient.getAddress());

	        int count = ((Number) query.getOutputParameterValue("ReturnId")).intValue();
	    	return count;
	}

}
