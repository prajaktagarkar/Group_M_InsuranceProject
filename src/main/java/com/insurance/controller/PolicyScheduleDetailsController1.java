package com.insurance.controller;
/*fetch policy details
 * Task no:160
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyScheduleDetails1;
import com.insurance.service.PolicyScheduleDetailsService1;


@RestController
public class PolicyScheduleDetailsController1 {
@Autowired
	private PolicyScheduleDetailsService1 policyScheduleDetailsService;
	@GetMapping("/get/{Id}")
	public ResponseEntity<PolicyScheduleDetails1> fetchPolicyScheduleDetails(@PathVariable("id")Integer Id) {
	
		PolicyScheduleDetails1 policyScheduleDetails = policyScheduleDetailsService.getAllScheduleDetailsById(Id);
		
		return ResponseEntity.ok().body(policyScheduleDetails);
}
	
}