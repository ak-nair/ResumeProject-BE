package com.coolascode.app.dto;

public class PrescriptionHistoryDto {

	private int prescriptionId;
	private int appointmentId;
	private String diagnosis;
	private String staffName;
	private String patientName;
	private  int medicineprescriptionId;
	private  int medicineId;
	private String medicineName;
	private  int testId;
	private String testName;
	private  int testprescriptionId;
	
	public PrescriptionHistoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PrescriptionHistoryDto(int prescriptionId, int appointmentId, String diagnosis, String staffName,
			String patientName, int medicineprescriptionId, int medicineId, String medicineName, int testId,
			String testName, int testprescriptionId) {
		super();
		this.prescriptionId = prescriptionId;
		this.appointmentId = appointmentId;
		this.diagnosis = diagnosis;
		this.staffName = staffName;
		this.patientName = patientName;
		this.medicineprescriptionId = medicineprescriptionId;
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.testId = testId;
		this.testName = testName;
		this.testprescriptionId = testprescriptionId;
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
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getMedicineprescriptionId() {
		return medicineprescriptionId;
	}
	public void setMedicineprescriptionId(int medicineprescriptionId) {
		this.medicineprescriptionId = medicineprescriptionId;
	}
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public int getTestprescriptionId() {
		return testprescriptionId;
	}
	public void setTestprescriptionId(int testprescriptionId) {
		this.testprescriptionId = testprescriptionId;
	}
	
	
	
	
	
}
