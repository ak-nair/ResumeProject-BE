package com.coolascode.app.dto;

import java.util.Date;

public class LabTestDTO {
	
	private int prescriptionId;
	private int testprescriptionId;
	private int testId;
	private String testName;
	private double unitPrice;
	private Date createdDate;
	private Date modifiedDate;
	
	
	public LabTestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public LabTestDTO(int prescriptionId, int testprescriptionId, int testId, String testName) {
		super();
		this.prescriptionId = prescriptionId;
		this.testprescriptionId = testprescriptionId;
		this.testId = testId;
		this.testName = testName;
	}

	public LabTestDTO(int prescriptionId, int testprescriptionId, int testId, String testName,double unitPrice) {
		super();
		this.prescriptionId = prescriptionId;
		this.testprescriptionId = testprescriptionId;
		this.testId = testId;
		this.testName = testName;
		this.unitPrice = unitPrice;
	}
	public LabTestDTO(int prescriptionId, int testprescriptionId, int testId, String testName, double unitPrice,
			Date createdDate, Date modifiedDate) {
		super();
		this.prescriptionId = prescriptionId;
		this.testprescriptionId = testprescriptionId;
		this.testId = testId;
		this.testName = testName;
		this.unitPrice = unitPrice;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}


	public LabTestDTO(int prescriptionId, int testprescriptionId, int testId, String testName, Date createdDate,
			Date modifiedDate) {
		super();
		this.prescriptionId = prescriptionId;
		this.testprescriptionId = testprescriptionId;
		this.testId = testId;
		this.testName = testName;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}


	public int getPrescriptionId() {
		return prescriptionId;
	}


	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}


	public int getTestprescriptionId() {
		return testprescriptionId;
	}


	public void setTestprescriptionId(int testprescriptionId) {
		this.testprescriptionId = testprescriptionId;
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







}