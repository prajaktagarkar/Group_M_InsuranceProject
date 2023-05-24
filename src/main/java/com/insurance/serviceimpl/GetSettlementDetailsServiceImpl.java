package com.insurance.serviceimpl;
//Task- 177: Design web service to get the settlement details.
//@author----->Poonam Patil

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.GetSettlementDetails;
import com.insurance.repository.GetSettlementDetailsRepository;
import com.insurance.service.GetSettlementDetailsService;
@Service
public class GetSettlementDetailsServiceImpl implements GetSettlementDetailsService{

@Autowired
	private GetSettlementDetailsRepository getSettlementDetailsRepository;
	
	@Override
	public GetSettlementDetails getSettlementDetailsById(Integer Id) {
		GetSettlementDetails getSettlementDetails=getSettlementDetailsRepository.findById(Id);
		return getSettlementDetails;
	}

}
