package com.coolascode.app.service;

import java.util.List;

import com.coolascode.app.dto.AppointmentDto;
import com.coolascode.app.dto.NoteDto;

public interface IAppointmentService {

	//Insert/Update
	public int saveAppointment(AppointmentDto appt);

	public int saveNote(NoteDto not);
	
	public List<AppointmentDto> getAppointmentHistory();
	public List<AppointmentDto> getAllAppointmentHistory();
	
}
