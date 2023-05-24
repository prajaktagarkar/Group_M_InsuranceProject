package com.insurance.service;

//Task- 175 Design web service to add the settlement details once claim is done ------>
//@author----->Poonam Patil


import com.insurance.model.SettlementDetails;

public interface SettlementDetailsService {
	public SettlementDetails saveSettlementDetails(SettlementDetails settlementDetails);
}
