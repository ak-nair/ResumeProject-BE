package com.coolascode.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.entity.Labtest;

@Repository
public interface  ILabTestRepo extends CrudRepository<Labtest, Integer> {

}
