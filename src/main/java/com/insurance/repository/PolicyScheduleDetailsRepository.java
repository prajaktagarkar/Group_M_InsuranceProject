package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicyScheduleDetails;
@Repository
public interface PolicyScheduleDetailsRepository extends CrudRepository<PolicyScheduleDetails, Serializable>{
public PolicyScheduleDetails findById(Integer id);
}
