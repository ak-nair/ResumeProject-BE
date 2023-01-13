package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.IMedicineAddRepo;
import com.coolascode.app.dao.IMedicineRepo;
import com.coolascode.app.dto.MedineAddDto;
import com.coolascode.app.entity.Medicine;

@Service
public class MedicineServiceImple implements IMedicineService {

	@Autowired
	private IMedicineRepo medicineRepo;

	@Autowired
	private IMedicineAddRepo medicineaddRepo;
	
	@Override
	public List<Medicine> getMedicine() {

		return (List<Medicine>)medicineRepo.findAll();
	}


	@Override
	public Optional<Medicine> getMedicine(int medicineId) {
		return medicineRepo.findById(medicineId);
	}

	@Override
	public void deleteMedicine(int medicineId) {
		medicineRepo.deleteById(medicineId);
		
	}

	@Override
	public int saveMedicine(MedineAddDto medicine) {
		int result=medicineaddRepo.saveMedicine(medicine);
		return result;
	}
	
//	@Override
//	public int saveMedicine(MedineAddDto medicine) {
//		int result=medicineaddRepo.saveMedicine(medicine);
//		return result;
//	}
}
