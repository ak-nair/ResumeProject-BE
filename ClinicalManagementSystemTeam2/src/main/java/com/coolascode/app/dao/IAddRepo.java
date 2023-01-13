package com.coolascode.app.dao;


import com.coolascode.app.dto.AppointmentDto;
import com.coolascode.app.dto.NoteDto;
import com.coolascode.app.dto.StaffDoctorDto;

public interface IAddRepo {
	
	//Insert/Update
	public int saveStaffDoctor(StaffDoctorDto staffdr);

	//Insert/Update
	public int saveAppointment(AppointmentDto appr);
	//Insert/Update
	public int saveNote(NoteDto note);

}
