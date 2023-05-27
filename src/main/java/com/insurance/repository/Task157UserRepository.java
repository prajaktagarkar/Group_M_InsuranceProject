package com.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Task157User;



/*
 * Task157 Get User with multiple premium details

 * @Author Prajakta Garkar
 */
@Repository
public interface Task157UserRepository extends CrudRepository<Task157User, Serializable>{

	
	public Task157User findById(Integer id);
}
