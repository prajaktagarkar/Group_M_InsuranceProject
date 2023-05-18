package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyPremiumDetails;
import com.insurance.repository.PolicyPremiumDetailsRepository;
import com.insurance.service.PolicyPremiumDetailsService;

@Service
public class PolicyPremiumDetailsServiceImpl implements PolicyPremiumDetailsService {

	@Autowired
	private PolicyPremiumDetailsRepository policyPremiumDetailsRepository;

	@Override
	public PolicyPremiumDetails savePolicyPremiumDetails(PolicyPremiumDetails policyPremiumDetails) {
		return 	policyPremiumDetailsRepository.save(policyPremiumDetails);
		
	}

}
