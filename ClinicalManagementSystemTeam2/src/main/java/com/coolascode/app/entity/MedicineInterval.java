package com.coolascode.app.entity;

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
@Table(name="medicine_interval")
public class MedicineInterval {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicine_interval_id")
	private int medicineIntervalId;
	
	@Column(name="medicine_interval_name")
	private String medicineIntervalName;
	

	@OneToMany(mappedBy="medicineInterval")
	private List<MedicinePrescription> medicineprescription;


	public MedicineInterval() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MedicineInterval(int medicineIntervalId, String medicineIntervalName,
			List<MedicinePrescription> medicineprescription) {
		super();
		this.medicineIntervalId = medicineIntervalId;
		this.medicineIntervalName = medicineIntervalName;
		this.medicineprescription = medicineprescription;
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

@JsonBackReference
	public List<MedicinePrescription> getMedicineprescription() {
		return medicineprescription;
	}


	public void setMedicineprescription(List<MedicinePrescription> medicineprescription) {
		this.medicineprescription = medicineprescription;
	}
	
	

	
}