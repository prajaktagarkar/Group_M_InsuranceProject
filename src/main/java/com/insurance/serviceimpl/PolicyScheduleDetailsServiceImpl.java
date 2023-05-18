package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyScheduleDetails;
import com.insurance.repository.PolicyScheduleDetailsRepository;
import com.insurance.service.PolicyScheduleDetailsService;

@Service
public class PolicyScheduleDetailsServiceImpl implements PolicyScheduleDetailsService {
	@Autowired
	private PolicyScheduleDetailsRepository policyScheduleDetailsRepository;

//	@Override
//	public PolicyScheduleDetails updatePolicyScheduleDetails(Integer id) {
//		PolicyScheduleDetails policyScheduleDetails=policyScheduleDetailsRepository.findById(id);
//		policyScheduleDetails.setPlanName();
//	}

	@Override
	public PolicyScheduleDetails updatePolicyScheduleDetails(Integer id, PolicyScheduleDetails policyScheduleDetails) {
		PolicyScheduleDetails policyScheduleDetails1 = policyScheduleDetailsRepository.findById(id);
		policyScheduleDetails1.setPlanName(policyScheduleDetails.getPlanName());
		policyScheduleDetails1.setPolicyName(policyScheduleDetails.getPolicyName());
		policyScheduleDetails1.setUserName(policyScheduleDetails.getUserName());
		PolicyScheduleDetails policyScheduleDetails2=policyScheduleDetailsRepository.save(policyScheduleDetails1);
	
	return policyScheduleDetails2;
	}

}
