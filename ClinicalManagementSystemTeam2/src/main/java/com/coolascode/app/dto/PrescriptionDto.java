package com.coolascode.app.dto;

public class PrescriptionDto {
	
	private int prescriptionId;
	private int appointmentId;
	private String diagnosis;
	private String staffName;
	private String patientName;
	
	
	public PrescriptionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public PrescriptionDto(int prescriptionId) {
		super();
		this.prescriptionId = prescriptionId;
	}

	
	public PrescriptionDto(int prescriptionId,  String diagnosis,String staffName, String patientName) {
		super();
		this.prescriptionId = prescriptionId;
		this.diagnosis=diagnosis;
		this.staffName = staffName;
		this.patientName = patientName;
	}



	public PrescriptionDto(int prescriptionId, int appointmentId, String diagnosis) {
		super();
		this.prescriptionId = prescriptionId;
		this.appointmentId = appointmentId;
		this.diagnosis = diagnosis;
	}
	public int getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}



	public String getStaffName() {
		return staffName;
	}



	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}



	public String getpatientName() {
		return patientName;
	}



	public void setpatientName(String patientName) {
		this.patientName = patientName;
	}
	 
	 
	 
}
