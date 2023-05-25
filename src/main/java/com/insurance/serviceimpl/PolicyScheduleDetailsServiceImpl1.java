package com.insurance.serviceimpl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyScheduleDetails1;
import com.insurance.repository.PolicyScheduleDetailsRepository1;
import com.insurance.service.PolicyScheduleDetailsService1;
@Service
public class PolicyScheduleDetailsServiceImpl1 implements PolicyScheduleDetailsService1 {
	@Autowired
	private PolicyScheduleDetailsRepository1 policyScheduleDetailsRepository;

	@Override
	public PolicyScheduleDetails1 getAllScheduleDetailsById(Integer Id) {
		return policyScheduleDetailsRepository.findById(Id);
		
	}

	

}
