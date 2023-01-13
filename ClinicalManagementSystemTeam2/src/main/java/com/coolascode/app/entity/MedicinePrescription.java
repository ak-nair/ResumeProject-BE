package com.coolascode.app.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="medicineprescription")
public class MedicinePrescription {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicineprescription_id")
	private int medicineprescriptionId;
	
	@Column(name="prescription_id")
	private int prescriptionId;
	
	@ManyToOne
	@JoinColumn(name="prescription_id", insertable=false,updatable=false)
	private Prescription prescription;
	
	@Column(name="medicine_id")
	private int medicineId;
	
	@ManyToOne
	@JoinColumn(name="medicine_id", insertable=false,updatable=false)
	private Medicine medicine;
	
	@Column(name="medicine_interval_id")
	private int medicineIntervalId;
	
	@ManyToOne
	@JoinColumn(name="medicine_interval_id", insertable=false,updatable=false)
	private MedicineInterval medicineInterval;
	
	@Column(name="course")
	private String course;
	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;


	@OneToMany(mappedBy="medicineprescription")
	private List<MedicineView> medicineview;
	
	
	public MedicinePrescription() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MedicinePrescription(int medicineprescriptionId, int prescriptionId, Prescription prescription,
			int medicineId, Medicine medicine, int medicineIntervalId, MedicineInterval medicineInterval, String course,
			Date createdDate, Date modifiedDate, List<MedicineView> medicineview) {
		super();
		this.medicineprescriptionId = medicineprescriptionId;
		this.prescriptionId = prescriptionId;
		this.prescription = prescription;
		this.medicineId = medicineId;
		this.medicine = medicine;
		this.medicineIntervalId = medicineIntervalId;
		this.medicineInterval = medicineInterval;
		this.course = course;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.medicineview = medicineview;
	}


	public int getMedicineprescriptionId() {
		return medicineprescriptionId;
	}


	public void setMedicineprescriptionId(int medicineprescriptionId) {
		this.medicineprescriptionId = medicineprescriptionId;
	}


	public int getPrescriptionId() {
		return prescriptionId;
	}


	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}


	public Prescription getPrescription() {
		return prescription;
	}


	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}


	public int getMedicineId() {
		return medicineId;
	}


	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}


	public Medicine getMedicine() {
		return medicine;
	}


	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}


	public int getMedicineIntervalId() {
		return medicineIntervalId;
	}


	public void setMedicineIntervalId(int medicineIntervalId) {
		this.medicineIntervalId = medicineIntervalId;
	}


	public MedicineInterval getMedicineInterval() {
		return medicineInterval;
	}


	public void setMedicineInterval(MedicineInterval medicineInterval) {
		this.medicineInterval = medicineInterval;
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


	public List<MedicineView> getMedicineview() {
		return medicineview;
	}


	public void setMedicineview(List<MedicineView> medicineview) {
		this.medicineview = medicineview;
	}
	
	

	
}
