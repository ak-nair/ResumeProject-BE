package com.coolascode.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.coolascode.app.entity.Gender;

public interface IGenderRepo extends CrudRepository<Gender, Integer> {

}
