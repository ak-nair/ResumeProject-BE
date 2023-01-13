package com.coolascode.app.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.coolascode.app.dto.AppointmentDto;
import com.coolascode.app.dto.NoteDto;
import com.coolascode.app.dto.StaffDoctorDto;
import org.springframework.stereotype.Repository;

@Repository
public class AddStaffRepo implements IAddRepo {


    private final static String USERS_PROC = "Save_Staff_Doctor";
    private final static String Appoi_Proc = "Save_Appointment";
    private final static String note_proc = "Save_Note";
    
    @Autowired
    private EntityManager entityManager;
    
	@Override
	public int saveStaffDoctor(StaffDoctorDto staffdr) {
		
	        StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery( USERS_PROC);
	        
	        query.registerStoredProcedureParameter("staffId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("staffNo", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("staffName", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("mobile", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("email", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("genderId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("address", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("education", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("dob", Date.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("dateOfJoining", Date.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("userName", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("password", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("roleId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("departmentId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("specializationId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("consultationFees", Double.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("ResultParam", Integer.class, ParameterMode.OUT);
	        
	        query.setParameter("staffId", staffdr.getStaffId());
	        query.setParameter("staffNo", staffdr.getStaffNo());
	        query.setParameter("staffName", staffdr.getStaffName());
	        query.setParameter("mobile", staffdr.getMobile());
	        query.setParameter("email", staffdr.getEmail());
	        query.setParameter("genderId", staffdr.getGenderId());
	        query.setParameter("address", staffdr.getAddress());
	        query.setParameter("education", staffdr.getEducation());
	        query.setParameter("dob", staffdr.getDob());
	        query.setParameter("dateOfJoining", staffdr.getDateOfJoining());
	        query.setParameter("userName", staffdr.getUserName());
	        query.setParameter("password", staffdr.getPassword());
	        query.setParameter("roleId", staffdr.getRoleId());
	        query.setParameter("departmentId", staffdr.getDepartmentId());
	        query.setParameter("specializationId", staffdr.getSpecializationId());
	        query.setParameter("consultationFees", staffdr.getConsultationFees());

	        int count = ((Number) query.getOutputParameterValue("ResultParam")).intValue();
	    	return count;
	}

	@Override
	public int saveAppointment(AppointmentDto appr) {
		
        StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery( Appoi_Proc);
        
        query.registerStoredProcedureParameter("apptId", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("deptId", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("patientId", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("doctorId", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("appDate", Date.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("ResultParam", Integer.class, ParameterMode.OUT);
        
        query.setParameter("apptId", appr.getAppointmentId());
        query.setParameter("deptId", appr.getDepartmentId());
        query.setParameter("patientId", appr.getPatientId());
        query.setParameter("doctorId", appr.getDoctorId());
        query.setParameter("appDate", appr.getAppointmentDate());

        int count = ((Number) query.getOutputParameterValue("ResultParam")).intValue();
    	return count;
	}

	@Override
	public int saveNote(NoteDto note) {
	     StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery( note_proc);
	        
	        query.registerStoredProcedureParameter("noteId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("presId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("desc", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("ream", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("appDate", Date.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("ResultParam", Integer.class, ParameterMode.OUT);
	        
	        query.setParameter("noteId", note.getNoteId());
	        query.setParameter("presId", note.getPrescriptionId());
	        query.setParameter("desc", note.getNoteDescription());
	        query.setParameter("ream", note.getRemarks());
	        query.setParameter("appDate", note.getAppliedDate());

	        int count = ((Number) query.getOutputParameterValue("ResultParam")).intValue();
	    	return count;
	}

}
