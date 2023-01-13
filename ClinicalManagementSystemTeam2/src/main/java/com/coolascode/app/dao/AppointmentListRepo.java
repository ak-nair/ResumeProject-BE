package com.coolascode.app.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.AppointmentDto;
import com.coolascode.app.dto.AppointmentListDto;
import com.coolascode.app.entity.Appointment;

@Repository
public interface AppointmentListRepo extends CrudRepository<Appointment, Integer> {

	@Query("SELECT new com.coolascode.app.dto.AppointmentListDto( p.patientId,p.patientName, "
		      + "a.appointmentDate, a.tokenNo,a.status,d.staffId,a.appointmentId )"
		      + "FROM Appointment a "
		      + "INNER JOIN a.patient p "
		      + "INNER JOIN a.doctor d "
		      + "WHERE d.staffId=:staffId and a.appointmentDate=curdate()")
	public List<AppointmentListDto> getAppointmentList(int staffId);

	@Query("SELECT new com.coolascode.app.dto.AppointmentDto( a.appointmentId,p.patientId,p.patientName, "
		      + "t.departmentId,t.departmentName, a.doctorId,s.staffName,a.appointmentDate,a.tokenNo )"
		      + "FROM Appointment a "
		      + "INNER JOIN a.patient p "
		      + "INNER JOIN a.department t "
		      + "INNER JOIN a.doctor d "
		      + "INNER JOIN d.staff s "
		      + "WHERE  a.appointmentDate=curdate()")
	public List<AppointmentDto> getAppointmentHistory();


	@Query("SELECT new com.coolascode.app.dto.AppointmentDto( a.appointmentId,p.patientId,p.patientName, "
		      + "t.departmentId,t.departmentName, a.doctorId,s.staffName,a.appointmentDate,a.tokenNo )"
		      + "FROM Appointment a "
		      + "INNER JOIN a.patient p "
		      + "INNER JOIN a.department t "
		      + "INNER JOIN a.doctor d "
		      + "INNER JOIN d.staff s ")
	public List<AppointmentDto> getAllAppointmentHistory();
	
}
