package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyScheduleDetails;
import com.insurance.service.PolicyScheduleDetailsService;

@RestController
public class PolicyScheduleDetailsController {
	//Injecting service
	@Autowired
	private PolicyScheduleDetailsService policyScheduleDetailsService;

	@PutMapping("/updatedetails/{id}")
	public ResponseEntity<PolicyScheduleDetails> updatePolicyScheduleDetails1(@PathVariable("id") Integer id,
			@RequestBody PolicyScheduleDetails policyScheduleDetails) {
		PolicyScheduleDetails policyScheduleDetails1 = policyScheduleDetailsService.updatePolicyScheduleDetails(id,
				policyScheduleDetails);
		return ResponseEntity.ok().body(policyScheduleDetails1);
	}
}
