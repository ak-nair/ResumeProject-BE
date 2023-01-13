package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.DoctorRepo;
import com.coolascode.app.dao.IAddRepo;
import com.coolascode.app.dao.ISpecializationRepo;
import com.coolascode.app.dao.StaffRepo;
import com.coolascode.app.dto.Dashboard;
import com.coolascode.app.dto.StaffDoctorDto;
import com.coolascode.app.dto.StaffDto;
import com.coolascode.app.entity.Doctor;
import com.coolascode.app.entity.Specialization;
import com.coolascode.app.entity.Staff;

@Service
public class StaffServiceImple implements IStaffService {

	@Autowired
	private StaffRepo staffrepo;
	
	@Autowired
	private DoctorRepo doctorrepo;

	@Autowired
	private IAddRepo addRepo;

	@Autowired
	private ISpecializationRepo specRepo;
	
	@Override
	public List<Staff> getStaff() {
		
		return (List<Staff>)staffrepo.findAll();
	}

	@Override
	public void saveStaff(Staff staff) {
		
		staffrepo.save(staff);
	}

	@Override
	public Optional<Staff> getStaff(int staffId) {
		
		return staffrepo.findById(staffId);
	}

	@Override
	public void deleteStaff(int staffId) {
		staffrepo.deleteById(staffId);
		
	}

	@Override
	public int saveStaffDoctor(StaffDoctorDto staffdr) {
		
		int result=addRepo.saveStaffDoctor(staffdr);
		return result;
		
	}

	@Override
	public List<StaffDto> Get_Staff_List() {		
		return staffrepo.Get_Staff_List();
	}

	@Override
	public List<Specialization> specialization_Typeahead(int departmentId, String specializationName) {
		// TODO Auto-generated method stub
		return  (List<Specialization>)specRepo.Specialization_Typeahead(departmentId, specializationName);
	}

	@Override
	public List<StaffDoctorDto> get_doctor_department(int departmentId, String doctorName) {
		// TODO Auto-generated method stub
		return  (List<StaffDoctorDto>)staffrepo.get_doctor_department(departmentId, doctorName);
	}

	@Override
	public Optional<StaffDoctorDto> getDoctor(int staffId) {

		return doctorrepo.getDoctor(staffId);
	}

}
