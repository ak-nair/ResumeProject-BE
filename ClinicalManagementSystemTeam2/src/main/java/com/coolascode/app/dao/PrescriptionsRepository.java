package com.coolascode.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.PrescriptionDto;
import com.coolascode.app.dto.PrescriptionHistoryDto;
import com.coolascode.app.entity.Department;
import com.coolascode.app.entity.Prescription;

@Repository
public interface PrescriptionsRepository  extends CrudRepository<Prescription, Integer> {

//	@Query("FROM prescription  "
//		      + "WHERE appointmentId=:appointmentId ")
//	public Optional<Prescription> Get_Prescription(int appointmentId);


	@Query(value = "CALL Get_Prescription(:appointmentId);", nativeQuery = true)
	public Optional<Prescription> Get_Prescription(int appointmentId);
	


//	@Query("SELECT DISTINCT new com.coolascode.app.dto.PrescriptionDto(c.prescriptionId, a.appointmentId, p.patientName,s.staffName )"
//			      + "FROM Prescription c "
//			      + "INNER JOIN c.appointment a"
//			      + "INNER JOIN a.patient p "
//			      + "INNER JOIN a.doctor d"
//			      + "INNER JOIN d.staff s ")
//			      + " Where c.prescriptionId=:prescriptionId ")

	@Query("SELECT DISTINCT new com.coolascode.app.dto.PrescriptionDto( c.prescriptionId, c.diagnosis, p.patientName,s.staffName )"
		      + "FROM Prescription c "
		      + "INNER JOIN c.appointment a "
		      + "INNER JOIN a.patient p "
		      + "INNER JOIN a.doctor d "
		      + "INNER JOIN d.staff s "
		      + " Where  c.createdDate=CURRENT_DATE")
	public List<PrescriptionDto> getPres();
	
	@Query("SELECT DISTINCT new com.coolascode.app.dto.PrescriptionHistoryDto( c.prescriptionId, c.appointmentId, c.diagnosis,s.staffName,"
			+ " p.patientName,m.medicineprescriptionId,n.medicineId,n.medicineName,l.testId,l.testName,t.testprescriptionId)"
		      + "FROM Prescription c "
		      + "INNER JOIN c.appointment a "
		      + "INNER JOIN a.patient p "
		      + "INNER JOIN a.doctor d "
		      + "INNER JOIN d.staff s "
		      + "INNER JOIN c.medicineprescription m "
		      + "INNER JOIN m.medicine n "
		      + "INNER JOIN c.testprescription t "
		      + "INNER JOIN t.labtest l "
		      + " Where  a.patientId=?1")
	public List<PrescriptionHistoryDto> getPatientHistory(int PatientId);
	
}
