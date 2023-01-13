package com.coolascode.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.MedicineDTO;
import com.coolascode.app.entity.MedicinePrescription;

@Repository
public interface MedicinePrescriptionRepo extends CrudRepository<MedicinePrescription, Integer> {


	@Query("SELECT new com.coolascode.app.dto.MedicineDTO(m.prescriptionId,m.medicineId, m.medicineprescriptionId, "
			      + "p.medicineName,m.medicineIntervalId,i.medicineIntervalName, m.course)"
			      + "FROM MedicinePrescription m INNER JOIN m.medicine p "
			      + " INNER JOIN  m.medicineInterval i Where m.prescriptionId=?1 ")
	public List<MedicineDTO> getAllMedicinePres(int prescriptionId);
}
