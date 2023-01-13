package com.coolascode.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.AppointmentListRepo;
import com.coolascode.app.dao.IAddRepo;
import com.coolascode.app.dao.StaffRepo;
import com.coolascode.app.dto.AppointmentDto;
import com.coolascode.app.dto.NoteDto;

@Service
public class AppointmentServiceImple implements IAppointmentService{

	@Autowired
	private AppointmentListRepo appointList;
	
	@Autowired
	private IAddRepo addRepo;
	
	@Override
	public int saveAppointment(AppointmentDto appt) {

		int result=addRepo.saveAppointment(appt);
		return result;
	}

	@Override
	public List<AppointmentDto> getAppointmentHistory() {

		return appointList.getAppointmentHistory();
	}

	@Override
	public List<AppointmentDto> getAllAppointmentHistory() {

		return appointList.getAllAppointmentHistory();
	}

	@Override
	public int saveNote(NoteDto not) {

		int result=addRepo.saveNote(not);
		return result;
	}

}
