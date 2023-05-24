package com.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicyDetailsExcel;

@Repository
public interface PolicyDetailsExcelRepository extends CrudRepository<PolicyDetailsExcel, Serializable>{
	@Query(value = "select * from policyexcel p where policy_expiry_date=?/1", nativeQuery = true)
	List<PolicyDetailsExcel> findByExpiryDate(String policyExpiryDate);

}
