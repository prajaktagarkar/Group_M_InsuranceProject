package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Task135UpdateUser;


@Repository
public interface Task135UpdateUserRepository extends CrudRepository<Task135UpdateUser, Serializable>
{

	public Task135UpdateUser findById(Integer id);	

}
