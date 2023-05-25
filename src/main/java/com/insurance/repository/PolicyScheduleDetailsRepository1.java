package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicyScheduleDetails1;
@Repository
public interface PolicyScheduleDetailsRepository1 extends CrudRepository<PolicyScheduleDetails1,Serializable> {
public PolicyScheduleDetails1 findById(Integer Id);
}
