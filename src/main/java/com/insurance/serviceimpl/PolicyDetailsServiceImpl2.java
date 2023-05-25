package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.PolicyDetailsRepository2;
import com.insurance.service.PolicyDetailsService2;

@Service
public class PolicyDetailsServiceImpl2 implements PolicyDetailsService2 {
	@Autowired
	private PolicyDetailsRepository2 policyDetailsRepository;
	
	
	
	@Override
	public void deletePolicyDetails(Integer Id) {
		if(Id != null) {
			policyDetailsRepository.deleteById(Id);
			}else {
				throw new NullPointerException("The Given Id is Null");
			}	
		
	}

}
