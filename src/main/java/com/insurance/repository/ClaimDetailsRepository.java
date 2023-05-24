package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.ClaimDetails;
@Repository
public interface ClaimDetailsRepository extends CrudRepository<ClaimDetails, Integer> {

}
