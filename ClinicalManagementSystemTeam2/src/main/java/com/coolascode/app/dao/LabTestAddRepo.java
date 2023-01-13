package com.coolascode.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.LabDto;

@Repository
public class LabTestAddRepo implements ILabTestAddRepo {
	 private final static String LAB_PRO = "Save_Lab_Test";
	    
	    @Autowired
	    private EntityManager entityManager;
	    
		@Override
		public int saveLabTest(LabDto Labtest) {
			
	        StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery( LAB_PRO);
	        
	        query.registerStoredProcedureParameter("testId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("testCode", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("testName", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("unitPrice", Double.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("ResultId", Integer.class, ParameterMode.OUT);
	        
	        query.setParameter("testId", Labtest.getTestId());
	        query.setParameter("testCode", Labtest.getTestCode());
	        query.setParameter("testName", Labtest.getTestName());
	        query.setParameter("unitPrice", Labtest.getUnitPrice());


	        int count = ((Number) query.getOutputParameterValue("ResultId")).intValue();
	    	return count;
		}

}
