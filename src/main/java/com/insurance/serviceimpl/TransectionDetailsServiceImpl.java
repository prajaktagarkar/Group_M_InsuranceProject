package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.model.TransectionDetails;
import com.insurance.repository.TransectionDetailsRepository;
import com.insurance.service.TransectionDetailsService;

public class TransectionDetailsServiceImpl implements TransectionDetailsService {
	@Autowired
	private  TransectionDetailsRepository transectionDetailsRepository;

	@Override
	public TransectionDetails updateTransectionDetails(TransectionDetails transectionDetails) {
		TransectionDetails transectionDetails1 = transectionDetailsRepository.findById(transectionDetails.getId()).orElse(null);
		if(transectionDetails1 != null) {
			transectionDetails.setTransectionStatus(transectionDetails.getTransectionStatus());	
			transectionDetailsRepository.save(transectionDetails1);
			return transectionDetails1;
		}
		
		return null;
	}

}
