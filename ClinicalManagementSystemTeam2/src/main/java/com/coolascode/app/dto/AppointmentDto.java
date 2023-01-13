package com.coolascode.app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.coolascode.app.entity.Department;
import com.coolascode.app.entity.Doctor;
import com.coolascode.app.entity.Patient;
import com.coolascode.app.entity.Prescription;

public class AppointmentDto {
	
	private int appointmentId;
	private int patientId;
	private String patientName;
	private int departmentId;
	private String departmentName;
	private int doctorId;
	private String doctorName;
	private Date appointmentDate;
	private String tokenNo;
	private boolean status;
	
	public AppointmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppointmentDto(int appointmentId, int patientId, String patientName, int departmentId, String departmentName,int doctorId,
			String doctorName, Date appointmentDate, String tokenNo) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.departmentId = departmentId;
		this.departmentName=departmentName;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.appointmentDate = appointmentDate;
		this.tokenNo = tokenNo;
	}
	public AppointmentDto(int appointmentId, int patientId, String patientName, int departmentId, int doctorId,
			String doctorName, Date appointmentDate, String tokenNo, boolean status) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.departmentId = departmentId;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.appointmentDate = appointmentDate;
		this.tokenNo = tokenNo;
		this.status = status;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getDoctorId() {
		return doctorId;
	}
	
	

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getTokenNo() {
		return tokenNo;
	}

	public void setTokenNo(String tokenNo) {
		this.tokenNo = tokenNo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
}
