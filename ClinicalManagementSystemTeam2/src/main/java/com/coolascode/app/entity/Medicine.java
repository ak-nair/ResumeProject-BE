package com.coolascode.app.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="medicine")
public class Medicine {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicine_id")
	private int medicineId;
	
	
	@Column(name="medicine_code",nullable=false,length=50)
	private String medicineCode;
	
	@Column(name="medicine_name", nullable=false,length=50)
	private String medicineName;
	
	
	@Column(name="generic_name", nullable=false,length=50)
	private String genericName;
	
	@Column(name="company_name", nullable=false,length=50)
	private String companyName;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="unit")
	private String unit;

	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;

	@Column(name="is_active",nullable = false, columnDefinition = "TINYINT", length = 1)
	private boolean isActive;
	

	@OneToMany(mappedBy = "medicine")
	private List<MedicinePrescription> medicineprescription;


	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Medicine(int medicineId, String medicineCode, String medicineName, String genericName, String companyName,
			int quantity, String unit, double unitPrice, Date createdDate, Date modifiedDate, boolean isActive,
			List<MedicinePrescription> medicineprescription) {
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
		this.medicineprescription = medicineprescription;
	}



	public Medicine(int medicineId, String medicineCode, String medicineName, String genericName, String companyName,
			int quantity, String unit, Date createdDate, Date modifiedDate, boolean isActive,
			List<MedicinePrescription> medicineprescription) {
		super();
		this.medicineId = medicineId;
		this.medicineCode = medicineCode;
		this.medicineName = medicineName;
		this.genericName = genericName;
		this.companyName = companyName;
		this.quantity = quantity;
		this.unit = unit;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isActive = isActive;
		this.medicineprescription = medicineprescription;
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

	@JsonBackReference
	public List<MedicinePrescription> getMedicineprescription() {
		return medicineprescription;
	}


	public void setMedicineprescription(List<MedicinePrescription> medicineprescription) {
		this.medicineprescription = medicineprescription;
	}

	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
		
	

	

}
