package com.insurance.repository;
/*
 * Build the Restful API to get user details from database
 * @author Prajakta Garkar
 */
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Task136GetUser;

@RestController
public interface Task136GetUserRepository extends  CrudRepository<Task136GetUser, Serializable> {

	public Task136GetUser findById(Integer id);
}
