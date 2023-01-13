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
@Table(name="test_view")
public class TestView {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="test_view_id")
	private int testViewId;
	
	@Column(name="testprescription_id")
	private int testprescriptionId;

	@ManyToOne
	@JoinColumn(name="testprescription_id", insertable=false,updatable=false)
	private TestPrescription testprescription;
	
	@Column(name="low_range",precision=10, scale=2)
	private double lowRange;
	
	@Column(name="high_range",precision=10, scale=2)
	private double highRange;
	
	@Column(name="normal_range",precision=10, scale=2)
	private double normalRange;
	
	@Column(name="unit")
	private String unit;
	
	@Column(name="applied_date")
	private Date appliedDate;
	
	@Column(name="test_amount",precision=10, scale=2)
	private double testAmount;
	
	@Column(name="status", columnDefinition = "TINYINT", length = 1)
	private boolean status;
	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;
	
	

	public TestView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestView(int testViewId, int testprescriptionId, double lowRange, double highRange, double normalRange,
			String unit, Date appliedDate, double testAmount, boolean status, Date createdDate, Date modifiedDate) {
		super();
		this.testViewId = testViewId;
		this.testprescriptionId = testprescriptionId;
		this.lowRange = lowRange;
		this.highRange = highRange;
		this.normalRange = normalRange;
		this.unit = unit;
		this.appliedDate = appliedDate;
		this.testAmount = testAmount;
		this.status = status;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public int getTestViewId() {
		return testViewId;
	}

	public void setTestViewId(int testViewId) {
		this.testViewId = testViewId;
	}

	public int getTestprescriptionId() {
		return testprescriptionId;
	}

	public void setTestprescriptionId(int testprescriptionId) {
		this.testprescriptionId = testprescriptionId;
	}

	public double getLowRange() {
		return lowRange;
	}

	public void setLowRange(double lowRange) {
		this.lowRange = lowRange;
	}

	public double getHighRange() {
		return highRange;
	}

	public void setHighRange(double highRange) {
		this.highRange = highRange;
	}

	public double getNormalRange() {
		return normalRange;
	}

	public void setNormalRange(double normalRange) {
		this.normalRange = normalRange;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public double getTestAmount() {
		return testAmount;
	}

	public void setTestAmount(double testAmount) {
		this.testAmount = testAmount;
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

	public TestPrescription getTestprescription() {
		return testprescription;
	}

	public void setTestprescription(TestPrescription testprescription) {
		this.testprescription = testprescription;
	}

	public TestView(int testViewId, int testprescriptionId, TestPrescription testprescription, double lowRange,
			double highRange, double normalRange, String unit, Date appliedDate, double testAmount, boolean status,
			Date createdDate, Date modifiedDate) {
		super();
		this.testViewId = testViewId;
		this.testprescriptionId = testprescriptionId;
		this.testprescription = testprescription;
		this.lowRange = lowRange;
		this.highRange = highRange;
		this.normalRange = normalRange;
		this.unit = unit;
		this.appliedDate = appliedDate;
		this.testAmount = testAmount;
		this.status = status;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	
	

}