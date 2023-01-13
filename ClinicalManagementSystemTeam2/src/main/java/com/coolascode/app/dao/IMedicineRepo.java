package com.coolascode.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.coolascode.app.entity.Medicine;

@Repository
public interface  IMedicineRepo extends CrudRepository<Medicine, Integer> {

}
