package com.insurance.repository;

import java.io.Serializable;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.AddClaimDetails;

@Repository
public interface AddClaimDetailsRepository extends CrudRepository<AddClaimDetails, Serializable>{

}
