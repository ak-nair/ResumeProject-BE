package com.coolascode.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coolascode.app.dto.LabTestDTO;
import com.coolascode.app.entity.TestPrescription;

public interface LabTestPrescriptionRepo extends CrudRepository<TestPrescription, Integer> {


	@Query("SELECT new com.coolascode.app.dto.LabTestDTO(t.prescriptionId,t.testprescriptionId, t.testId, "
			      + "l.testName )"
			      + "FROM TestPrescription t INNER JOIN t.labtest l Where t.prescriptionId=?1 ")
	public List<LabTestDTO> getAllLabPres(int prescriptionId);
	
}
