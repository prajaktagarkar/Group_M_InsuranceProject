package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicyDetails;

@Repository
public interface PolicyDetailsRepository extends JpaRepository<PolicyDetails, Integer> {

	public PolicyDetails findById(PolicyDetails policyDetails);

	// public PolicyDetails FindById(String string);
}
