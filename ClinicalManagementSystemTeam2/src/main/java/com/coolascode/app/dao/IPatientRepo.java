package com.coolascode.app.dao;

import com.coolascode.app.dto.PatientDto;
import com.coolascode.app.entity.Patient;

public interface IPatientRepo {
	
	//Insert/Update
	public int savePatient(PatientDto patient);
	
}
