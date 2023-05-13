package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyDetails;
import com.insurance.repository.PolicyDetailsRepository;

@Service
public class PolicyDetailsServiceImpl implements PolicyDetailsService {

	@Autowired
	private PolicyDetailsRepository policyDetailsRepository;

	@Override
	public PolicyDetails update(PolicyDetails policyDetails) {
		PolicyDetails policy = policyDetailsRepository.findById(policyDetails.getId()).orElse(null);
		if (policy != null) {
			policy.setStatus(policyDetails.getStatus());
			policyDetailsRepository.save(policy);
			return policy;
		}
		return null;
	}

}
