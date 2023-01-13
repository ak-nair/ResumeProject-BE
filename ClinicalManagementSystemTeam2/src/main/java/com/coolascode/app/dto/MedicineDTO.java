package com.coolascode.app.dto;

import java.util.Date;

public class MedicineDTO {
	
	private int prescriptionId;
	private int medicineId;
	private int medicineprescriptionId;
	private String medicineName;
	private int medicineIntervalId;
	private String medicineIntervalName;
	private String course;
	private double unitPrice;
	private Date createdDate;
	private Date modifiedDate;
	
	public MedicineDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicineDTO(int prescriptionId, int medicineId, int medicineprescriptionId, String medicineName,
			int medicineIntervalId,String medicineIntervalName, String course) {
		super();
		this.prescriptionId = prescriptionId;
		this.medicineId = medicineId;
		this.medicineprescriptionId = medicineprescriptionId;
		this.medicineName = medicineName;
		this.medicineIntervalId = medicineIntervalId;
		this.medicineIntervalName=medicineIntervalName;
		this.course = course;
	}

	public MedicineDTO(int prescriptionId, int medicineId, int medicineprescriptionId, String medicineName,
			int medicineIntervalId,String medicineIntervalName, String course,double unitPrice) {
		super();
		this.prescriptionId = prescriptionId;
		this.medicineId = medicineId;
		this.medicineprescriptionId = medicineprescriptionId;
		this.medicineName = medicineName;
		this.medicineIntervalId = medicineIntervalId;
		this.medicineIntervalName=medicineIntervalName;
		this.course = course;
		this.unitPrice=unitPrice;
	}

	public MedicineDTO(int prescriptionId, int medicineId, int medicineprescriptionId, String medicineName,
			int medicineIntervalId, String course,double unitPrice) {
		super();
		this.prescriptionId = prescriptionId;
		this.medicineId = medicineId;
		this.medicineprescriptionId = medicineprescriptionId;
		this.medicineName = medicineName;
		this.medicineIntervalId = medicineIntervalId;
		this.course = course;
		this.unitPrice=unitPrice;
	}
	public MedicineDTO(int prescriptionId, int medicineId, int medicineprescriptionId, String medicineName,
			int medicineIntervalId, String course) {
		super();
		this.prescriptionId = prescriptionId;
		this.medicineId = medicineId;
		this.medicineprescriptionId = medicineprescriptionId;
		this.medicineName = medicineName;
		this.medicineIntervalId = medicineIntervalId;
		this.course = course;
	}

	public MedicineDTO(int prescriptionId, int medicineId, int medicineprescriptionId, String medicineName,
			int medicineIntervalId, String course, double unitPrice,Date createdDate, Date modifiedDate) {
		super();
		this.prescriptionId = prescriptionId;
		this.medicineId = medicineId;
		this.medicineprescriptionId = medicineprescriptionId;
		this.medicineName = medicineName;
		this.medicineIntervalId = medicineIntervalId;
		this.course = course;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.unitPrice=unitPrice;
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public int getMedicineprescriptionId() {
		return medicineprescriptionId;
	}

	public void setMedicineprescriptionId(int medicineprescriptionId) {
		this.medicineprescriptionId = medicineprescriptionId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	
	public int getMedicineIntervalId() {
		return medicineIntervalId;
	}

	public void setMedicineIntervalId(int medicineIntervalId) {
		this.medicineIntervalId = medicineIntervalId;
	}

	public String getMedicineIntervalName() {
		return medicineIntervalName;
	}

	public void setMedicineIntervalName(String medicineIntervalName) {
		this.medicineIntervalName = medicineIntervalName;
	}

	
	
}