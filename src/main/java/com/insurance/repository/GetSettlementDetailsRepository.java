package com.insurance.repository;
//Task- 177: Design web service to get the settlement details.
//@author----->Poonam Patil

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.GetSettlementDetails;
@Repository
public interface GetSettlementDetailsRepository extends CrudRepository<GetSettlementDetails, Serializable>{

	public GetSettlementDetails findById(Integer Id);
}
