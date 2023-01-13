package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import com.coolascode.app.dto.MedineAddDto;
import com.coolascode.app.entity.Medicine;

public interface IMedicineService {
	
	//List
	public List<Medicine> getMedicine();
	
	
	//Insert/Update
	public int saveMedicine(MedineAddDto medicine);

		
	//Search by id
	public Optional<Medicine> getMedicine(int medicineId);
	

	//Delete
	public void deleteMedicine(int medicineId);

}
