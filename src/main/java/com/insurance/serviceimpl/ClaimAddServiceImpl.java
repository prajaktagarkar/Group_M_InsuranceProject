package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.ClaimAdd;
import com.insurance.repository.ClaimAddRepository;
import com.insurance.service.ClaimAddService;

@Service
public class ClaimAddServiceImpl implements ClaimAddService{
	
	@Autowired
	private ClaimAddRepository claimRepository;

	@Override
	public ClaimAdd saveClaim(ClaimAdd claim) {
		ClaimAdd claim1=claimRepository.save(claim);
		return claim1;
	}

}
