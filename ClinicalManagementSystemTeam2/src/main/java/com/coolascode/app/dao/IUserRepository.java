package com.coolascode.app.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.entity.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {
	
	//custom method --in UserRepository
	@Query("FROM User WHERE userName=?1 and password=?2 and isActive=true")
	public User findUserByUsernameAndPassword(String userName,String password);

	

}