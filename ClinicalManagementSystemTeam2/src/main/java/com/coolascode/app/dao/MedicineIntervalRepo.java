package com.coolascode.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.entity.MedicineInterval;

@Repository
public interface MedicineIntervalRepo extends CrudRepository<MedicineInterval, Integer> {

}
