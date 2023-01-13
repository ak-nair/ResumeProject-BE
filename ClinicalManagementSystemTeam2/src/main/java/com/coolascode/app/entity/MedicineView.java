package com.coolascode.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medicine_view")
public class MedicineView {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicine_view_id")
	private int medicineViewId;
	
	@Column(name="medicineprescription_id")
	private int medicineprescriptionId;

	@ManyToOne
	@JoinColumn(name="medicineprescription_id", insertable=false,updatable=false)
	private MedicinePrescription medicineprescription;
	
	@Column(name="medicine_name", nullable=false,length=50)
	private String medicineName;

	
	@Column(name="medicine_amount",precision=10, scale=2)
	private double medicineAmount;
	
	@Column(name="status", columnDefinition = "TINYINT", length = 1)
	private boolean status;
	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;

	public MedicineView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicineView(int medicineViewId, int medicineprescriptionId, String medicineName, boolean status,
			Date createdDate, Date modifiedDate) {
		super();
		this.medicineViewId = medicineViewId;
		this.medicineprescriptionId = medicineprescriptionId;
		this.medicineName = medicineName;
		this.status = status;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public MedicineView(int medicineViewId, int medicineprescriptionId, MedicinePrescription medicineprescription,
			String medicineName, boolean status, Date createdDate, Date modifiedDate) {
		super();
		this.medicineViewId = medicineViewId;
		this.medicineprescriptionId = medicineprescriptionId;
		this.medicineprescription = medicineprescription;
		this.medicineName = medicineName;
		this.status = status;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public int getMedicineViewId() {
		return medicineViewId;
	}

	public void setMedicineViewId(int medicineViewId) {
		this.medicineViewId = medicineViewId;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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
	

	
	public double getMedicineAmount() {
		return medicineAmount;
	}

	public void setMedicineAmount(double medicineAmount) {
		this.medicineAmount = medicineAmount;
	}

	public MedicinePrescription getMedicineprescription() {
		return medicineprescription;
	}

	public void setMedicineprescription(MedicinePrescription medicineprescription) {
		this.medicineprescription = medicineprescription;
	}

}