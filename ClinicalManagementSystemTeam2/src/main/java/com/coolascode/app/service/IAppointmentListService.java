package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import com.coolascode.app.dto.AppointmentListDto;
import com.coolascode.app.dto.PrescriptionDto;
import com.coolascode.app.entity.MedicineInterval;
import com.coolascode.app.entity.Prescription;

public interface IAppointmentListService {
	
	public List<AppointmentListDto> getAppointmentList(int staffId);
	

	public List<MedicineInterval> getInterval();
}
