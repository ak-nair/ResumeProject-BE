package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.ILabTestAddRepo;
import com.coolascode.app.dao.ILabTestRepo;
import com.coolascode.app.dto.LabDto;
import com.coolascode.app.entity.Labtest;

@Service
public class LabServiceImple implements ILabService {

	@Autowired
	private ILabTestRepo labTestRepo;

	@Autowired
	private ILabTestAddRepo labaddRepo;
	
	@Override
	public List<Labtest> getLabTest() {

		return (List<Labtest>)labTestRepo.findAll();
	}

	@Override
	public int saveLabTest(LabDto labtest) {
		int result=labaddRepo.saveLabTest(labtest);
		return result;
	}

	@Override
	public Optional<Labtest> getLabTest(int labtestId) {
		return labTestRepo.findById(labtestId);
	}

	@Override
	public void deleteLabTest(int labtestId) {
		 labTestRepo.deleteById(labtestId);
		
	}

}
