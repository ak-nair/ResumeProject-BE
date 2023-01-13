package com.coolascode.app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.coolascode.app.entity.Prescription;

public class NoteDto {
	
	private int noteId;
	private int prescriptionId;
	private String noteDescription;
	private String remarks;
	private Date appliedDate;
	private Date createdDate;
	private Date modifiedDate;
	public NoteDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoteDto(int noteId, int prescriptionId, String noteDescription, String remarks, Date appliedDate,
			Date createdDate, Date modifiedDate) {
		super();
		this.noteId = noteId;
		this.prescriptionId = prescriptionId;
		this.noteDescription = noteDescription;
		this.remarks = remarks;
		this.appliedDate = appliedDate;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public int getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public String getNoteDescription() {
		return noteDescription;
	}
	public void setNoteDescription(String noteDescription) {
		this.noteDescription = noteDescription;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
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
	
	

}
