package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.AppointmentListRepo;
import com.coolascode.app.dao.MedicineIntervalRepo;
import com.coolascode.app.dao.PrescriptionsRepository;
import com.coolascode.app.dto.AppointmentListDto;
import com.coolascode.app.dto.PrescriptionDto;
import com.coolascode.app.entity.MedicineInterval;
import com.coolascode.app.entity.Prescription;


@Service
public class AppointmentListServiceImple implements IAppointmentListService{
	
	@Autowired
	private AppointmentListRepo appointList;

	@Autowired
	private MedicineIntervalRepo medrpo;
	
	@Override
	public List<AppointmentListDto> getAppointmentList(int staffId) {
		return appointList.getAppointmentList(staffId);
	}
	
	@Override
	public List<MedicineInterval> getInterval() {
		return  (List<MedicineInterval>) medrpo.findAll();
	}


}
