package com.coolascode.app.dto;

import java.util.Date;


public class MedineAddDto {
	
	private int medicineId;
	private String medicineCode;
	private String medicineName;
	private String genericName;
	private String companyName;
	private int quantity;
	private String unit;
	private double unitPrice;
	private Date createdDate;
	private Date modifiedDate;
	private boolean isActive;
	
	public MedineAddDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MedineAddDto(int medicineId, String medicineCode, String medicineName, String genericName,
			String companyName, int quantity, String unit, double unitPrice, Date createdDate, Date modifiedDate,
			boolean isActive) {
		super();
		this.medicineId = medicineId;
		this.medicineCode = medicineCode;
		this.medicineName = medicineName;
		this.genericName = genericName;
		this.companyName = companyName;
		this.quantity = quantity;
		this.unit = unit;
		this.unitPrice = unitPrice;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isActive = isActive;
	}
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicineCode() {
		return medicineCode;
	}
	public void setMedicineCode(String medicineCode) {
		this.medicineCode = medicineCode;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getGenericName() {
		return genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

}
