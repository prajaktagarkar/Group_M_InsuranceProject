package com.insurance.repository;

//Task- 175 Design web service to add the settlement details once claim is done ------>
//@author----->Poonam Patil

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.SettlementDetails;
@Repository
public interface SettlementDetailsRepository extends CrudRepository<SettlementDetails, Integer>{

	@SuppressWarnings("unchecked")
	SettlementDetails save(SettlementDetails settlementDetails);

}
