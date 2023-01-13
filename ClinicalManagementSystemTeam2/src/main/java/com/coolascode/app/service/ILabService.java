package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import com.coolascode.app.dto.LabDto;
import com.coolascode.app.entity.Labtest;

public interface ILabService {
	
	//List
	public List<Labtest> getLabTest();
	
	
	//Insert/Update
	public int saveLabTest(LabDto labtest);

		
	//Search by id
	public Optional<Labtest> getLabTest(int labtestId);
	

	//Delete
	public void deleteLabTest(int labtestId);

}
