package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Serializable> {
	   
		  public Login findById(Integer id);

}
