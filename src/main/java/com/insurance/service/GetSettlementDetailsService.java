package com.insurance.service;
//Task- 177: Design web service to get the settlement details.
//@author----->Poonam Patil

import com.insurance.model.GetSettlementDetails;

public interface GetSettlementDetailsService {
	public GetSettlementDetails getSettlementDetailsById(Integer Id);
}
