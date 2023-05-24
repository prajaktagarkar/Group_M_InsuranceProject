package com.insurance.repository;
//Task No 163: Design API to fetch branch details from system.
//@author PoonamPatil
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.TaskNo163FetchBranchDetails;
@Repository
public interface TaskNo163FetchBranchDetailsRepository extends CrudRepository<TaskNo163FetchBranchDetails, Serializable>{
	public TaskNo163FetchBranchDetails findById(Integer Id);
}
