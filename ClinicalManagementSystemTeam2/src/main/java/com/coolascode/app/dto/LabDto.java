package com.coolascode.app.dto;

import java.util.Date;

import javax.persistence.Column;

public class LabDto {


	private int testId;
	private String testCode;
	private String testName;
	private double unitPrice;
	private Date createdDate;
	private Date modifiedDate;
	private boolean isActive;
	
	public LabDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LabDto(int testId, String testCode, String testName, double unitPrice, Date createdDate, Date modifiedDate,
			boolean isActive) {
		super();
		this.testId = testId;
		this.testCode = testCode;
		this.testName = testName;
		this.unitPrice = unitPrice;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isActive = isActive;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestCode() {
		return testCode;
	}
	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
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
