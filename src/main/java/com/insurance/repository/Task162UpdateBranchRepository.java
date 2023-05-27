package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Task162UpdateBranch;

@Repository
public interface Task162UpdateBranchRepository extends CrudRepository<Task162UpdateBranch, Serializable> {

	public Task162UpdateBranch findById(Integer id);
}
