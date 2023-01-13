package com.coolascode.app.dto;

import java.util.Date;

public class AppointmentListDto {
	
	private int patientId;
	private String patientName;
	private Date appointmentDate;
	private String tokenNo;
	private boolean status;
	private int staffId;
	private int appointmentId;
	public AppointmentListDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentListDto(int patientId, String patientName, Date appointmentDate, String tokenNo,boolean status, int staffId,int appointmentId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.appointmentDate = appointmentDate;
		this.tokenNo = tokenNo;
		this.status=status;
		this.staffId = staffId;
		this.appointmentId=appointmentId;
	}
	public AppointmentListDto(int patientId, String patientName, Date appointmentDate, String tokenNo, int staffId,int appointmentId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.appointmentDate = appointmentDate;
		this.tokenNo = tokenNo;
		this.staffId = staffId;
		this.appointmentId=appointmentId;
	}
	public AppointmentListDto(int patientId, String patientName, Date appointmentDate, String tokenNo) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.appointmentDate = appointmentDate;
		this.tokenNo = tokenNo;
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
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	

	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
