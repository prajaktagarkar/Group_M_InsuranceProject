package com.insurance.serviceimpl;
//Task- 175 Design web service to add the settlement details once claim is done ------>
//@author----->Poonam Patil


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.SettlementDetails;
import com.insurance.repository.SettlementDetailsRepository;
import com.insurance.service.SettlementDetailsService;
@Service
public class SettlementDetailsServiceImpl implements SettlementDetailsService{

	@Autowired
 private SettlementDetailsRepository settlementDetailsRepository; 
	@Override
	public SettlementDetails saveSettlementDetails(SettlementDetails settlementDetails) {
		
		SettlementDetails details = settlementDetailsRepository.save(settlementDetails);
		return details;
		
	}

}
