package com.coolascode.app.dto;

import java.util.Date;

public class StaffDto {
	
	private int staffId;
	private String staffNo;
	private String staffName;
	private String mobile;
	private String email;
	private int genderId;
	private String genderName;
	private String address;	
	private String education;
	private Date dob;
	private Date dateOfJoining;
	private Date createdDate;
	private Date modifiedDate;
	private String userName;
	private String password;
	private int roleId;	
	private int departmentId;	
	private int specializationId;
	private String specializationName;
	public StaffDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StaffDto(int staffId, String staffNo, String staffName, String mobile, String email, int genderId,
			String address, String education, Date dob, Date dateOfJoining, Date createdDate,
			Date modifiedDate) {
		super();
		this.staffId = staffId;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.mobile = mobile;
		this.email = email;
		this.genderId = genderId;
		this.address = address;
		this.education = education;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}
	
	public StaffDto(int staffId, String staffNo, String staffName, String mobile, String email, int genderId,
			String genderName, String address, String education, Date dob, Date dateOfJoining, Date createdDate,
			Date modifiedDate) {
		super();
		this.staffId = staffId;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.mobile = mobile;
		this.email = email;
		this.genderId = genderId;
		this.genderName = genderName;
		this.address = address;
		this.education = education;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public StaffDto(int staffId, String staffNo, String staffName, String mobile, String email, int genderId,
			String address, String education, Date dob, Date dateOfJoining, Date createdDate,
			Date modifiedDate, String userName, String password, int roleId, int departmentId, int specializationId) {
		super();
		this.staffId = staffId;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.mobile = mobile;
		this.email = email;
		this.genderId = genderId;
		this.address = address;
		this.education = education;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.userName = userName;
		this.password = password;
		this.roleId = roleId;
		this.departmentId = departmentId;
		this.specializationId = specializationId;
	}

	public StaffDto(int staffId, String staffNo, String staffName, String mobile, String email, int genderId,
			String genderName, String address, String education, Date dob, Date dateOfJoining, Date createdDate,
			Date modifiedDate, String userName, String password, int roleId, int departmentId, int specializationId) {
		super();
		this.staffId = staffId;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.mobile = mobile;
		this.email = email;
		this.genderId = genderId;
		this.genderName = genderName;
		this.address = address;
		this.education = education;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.userName = userName;
		this.password = password;
		this.roleId = roleId;
		this.departmentId = departmentId;
		this.specializationId = specializationId;
	}


	public StaffDto(int staffId, String staffNo, String staffName, String mobile, String email, int genderId,
			String genderName, String address, String education, Date dob, Date dateOfJoining, Date createdDate,
			Date modifiedDate, String userName, String password, int roleId) {
		super();
		this.staffId = staffId;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.mobile = mobile;
		this.email = email;
		this.genderId = genderId;
		this.genderName = genderName;
		this.address = address;
		this.education = education;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.userName = userName;
		this.password = password;
		this.roleId = roleId;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getSpecializationId() {
		return specializationId;
	}
	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}
	

	public String getSpecializationName() {
		return specializationName;
	}

	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}

}
