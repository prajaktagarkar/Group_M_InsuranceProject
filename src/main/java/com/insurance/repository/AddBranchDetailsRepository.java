package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.AddBranchDetails;
@Repository
public interface AddBranchDetailsRepository extends JpaRepository<AddBranchDetails,Integer> {
	

}
