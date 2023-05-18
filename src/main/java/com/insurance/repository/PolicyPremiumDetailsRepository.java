package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicyPremiumDetails;
@Repository
public interface PolicyPremiumDetailsRepository extends CrudRepository<PolicyPremiumDetails, Serializable> {

}
