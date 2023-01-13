package com.coolascode.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coolascode.app.dto.AppointmentDto;
import com.coolascode.app.dto.AppointmentListDto;
import com.coolascode.app.dto.NoteDto;
import com.coolascode.app.dto.PrescriptionDto;
import com.coolascode.app.dto.StaffDoctorDto;
import com.coolascode.app.entity.MedicineInterval;
import com.coolascode.app.entity.Prescription;
import com.coolascode.app.service.IAppointmentListService;
import com.coolascode.app.service.IAppointmentService;
import com.coolascode.app.service.ILabService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AppointmentListController {
	
	
	@Autowired
	public IAppointmentListService appservice;
	@Autowired
	public IAppointmentService appntservice;
	
	@GetMapping("/appointmentlist/{staffId}")
	public List<AppointmentListDto> getAppointmentList(@PathVariable int staffId) {		
		return appservice.getAppointmentList(staffId);
	}

	@GetMapping("/appointhistory")
	public List<AppointmentDto> getAppointmentHistory() {		
		return appntservice.getAppointmentHistory();
	}

	@GetMapping("/appointhis")
	public List<AppointmentDto> getAllAppointmentHistory() {		
		return appntservice.getAppointmentHistory();
	}
	//Add staffs
	@PostMapping("/apptsave")
	public int saveAppointment(@RequestBody AppointmentDto appoi) {
		System.out.println("rtr");
		return appntservice.saveAppointment(appoi);
	}

	//Add staffs
	@PostMapping("/notesave")
	public int saveNote(@RequestBody NoteDto note) {
		System.out.println("rtr");
		return appntservice.saveNote(note);
	}
	
	@GetMapping("/interval")
	public List<MedicineInterval> getAppointmentList() {		
		return appservice.getInterval();
	}
	
}
