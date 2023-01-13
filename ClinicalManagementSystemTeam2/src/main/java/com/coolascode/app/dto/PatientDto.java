package com.coolascode.app.dto;

import java.util.Date;

public class PatientDto {
	
	private int patientId;
	private int staffId;
	private String  staffName;
	private String  patientName;
	private String patientNo;
	private String  mobile;
	private String email;
	private int  genderId;
	private String genderName;
	private int bloodGroupId;
	private String  bloodGroupName;
	private Date  dob;
	private String  address;
	private Date createdDate;
	private Date modifiedDate;
	private boolean isActive;
	
	public PatientDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientDto(int patientId, int staffId, String staffName, String patientName, String patientNo, String mobile,
			String email, int genderId, String genderName, int bloodGroupId, String bloodGroupName, Date dob,
			String address, Date createdDate, Date modifiedDate) {
		super();
		this.patientId = patientId;
		this.staffId = staffId;
		this.staffName = staffName;
		this.patientName = patientName;
		this.patientNo = patientNo;
		this.mobile = mobile;
		this.email = email;
		this.genderId = genderId;
		this.genderName = genderName;
		this.bloodGroupId = bloodGroupId;
		this.bloodGroupName = bloodGroupName;
		this.dob = dob;
		this.address = address;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public PatientDto(int patientId, int staffId, String staffName, String patientName, String patientNo, String mobile,
			String email, int genderId, String genderName, int bloodGroupId, String bloodGroupName, Date dob,
			String address, Date createdDate, Date modifiedDate,boolean isActive) {
		super();
		this.patientId = patientId;
		this.staffId = staffId;
		this.staffName = staffName;
		this.patientName = patientName;
		this.patientNo = patientNo;
		this.mobile = mobile;
		this.email = email;
		this.genderId = genderId;
		this.genderName = genderName;
		this.bloodGroupId = bloodGroupId;
		this.bloodGroupName = bloodGroupName;
		this.dob = dob;
		this.address = address;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isActive=isActive;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
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
	public String getPatientNo() {
		return patientNo;
	}
	public void setPatientNo(String patientNo) {
		this.patientNo = patientNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGenderId() {
		return genderId;
	}
	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}
	public String getGenderName() {
		return genderName;
	}
	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	public int getBloodGroupId() {
		return bloodGroupId;
	}
	public void setBloodGroupId(int bloodGroupId) {
		this.bloodGroupId = bloodGroupId;
	}
	public String getBloodGroupName() {
		return bloodGroupName;
	}
	public void setBloodGroupName(String bloodGroupName) {
		this.bloodGroupName = bloodGroupName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
