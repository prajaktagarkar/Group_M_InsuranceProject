package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.AddClaimDetails;
import com.insurance.repository.AddClaimDetailsRepository;
import com.insurance.service.AddClaimDetailsService;
@Service
public class AddClaimDetailsServiceImpl implements AddClaimDetailsService {

	@Autowired
	private AddClaimDetailsRepository addClaimDetailsRepository;
	
	
	@Override
	public AddClaimDetails addDetaild(AddClaimDetails addClaimDetails) {
		return  addClaimDetailsRepository.save(addClaimDetails);	
		
	}

}
