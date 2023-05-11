package com.insurance.TaskNo139.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.TaskNo139.model.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Serializable> {
	   
		  public Login findById(Integer id);

}
