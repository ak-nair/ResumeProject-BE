package com.coolascode.app.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.MedineAddDto;
import com.coolascode.app.entity.Medicine;

@Repository
public class MedicineAddRepo implements IMedicineAddRepo {
	 private final static String Med_PRO = "Save_Medicine";
	    
	    @Autowired
	    private EntityManager entityManager;
	    
		@Override
		public int saveMedicine(MedineAddDto medicine) {
			
	        StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery( Med_PRO);
	        
	        query.registerStoredProcedureParameter("medicineId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("medicineCode", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("medicineName", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("genericName", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("companyName", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("quantity", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("unit", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("unitPrice", Double.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("ResultId", Integer.class, ParameterMode.OUT);

	        query.setParameter("medicineId", medicine.getMedicineId());
	        query.setParameter("medicineCode", medicine.getMedicineCode());
	        query.setParameter("medicineName", medicine.getMedicineName());
	        query.setParameter("genericName", medicine.getGenericName());
	        query.setParameter("companyName", medicine.getCompanyName());
	        query.setParameter("quantity", medicine.getQuantity());
	        query.setParameter("unit", medicine.getUnit());
	        query.setParameter("unitPrice", medicine.getUnitPrice());

	        int count = ((Number) query.getOutputParameterValue("ResultId")).intValue();
	    	return count;
		}
		

}
