package com.coolascode.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="appointment")
public class Appointment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="appointment_id")
	private int appointmentId;
	
	@Column(name="patient_id")
	private int patientId;
	
	@ManyToOne
	@JoinColumn(name="patient_id", insertable=false,updatable=false)
	private Patient patient;
	
	@Column(name="department_id")
	private int departmentId;
	
	@ManyToOne
	@JoinColumn(name="department_id", insertable=false,updatable=false)
	private Department department;
	
	
	@Column(name="doctor_id")
	private int doctorId;

	@ManyToOne
	@JoinColumn(name="doctor_id", insertable=false,updatable=false)
	private Doctor doctor;
	
	@Column(name="appointment_date")
	private Date appointmentDate;
	
	@Column(name="token_no")
	private String tokenNo;

	@OneToOne(mappedBy = "appointment")
	private Prescription prescription;

	@Column(name="status", columnDefinition = "TINYINT", length = 1)
	private boolean status;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int appointmentId, int patientId, Patient patient, int departmentId, Department department,
			int doctorId, Doctor doctor, Date appointmentDate, String tokenNo, boolean status) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patient = patient;
		this.departmentId = departmentId;
		this.department = department;
		this.doctorId = doctorId;
		this.doctor = doctor;
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
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

	

//	public Prescription getPrescription() {
//		return prescription;
//	}
//
//	public void setPrescription(Prescription prescription) {
//		this.prescription = prescription;
//	}


}