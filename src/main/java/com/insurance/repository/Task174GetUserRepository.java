package com.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Task174GetUser;

@Repository
public interface Task174GetUserRepository extends CrudRepository<Task174GetUser, Serializable> {
	
	public Task174GetUser findById(Integer id);
}
