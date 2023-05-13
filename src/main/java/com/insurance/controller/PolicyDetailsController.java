package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyDetails;
import com.insurance.service.PolicyDetailsService;

@RestController
public class PolicyDetailsController {

	@Autowired
	private PolicyDetailsService policyDetailsService;

	@PutMapping("/updatepolicydata")
	public PolicyDetails update(@RequestBody PolicyDetails policyDeatils) {

		return policyDetailsService.update(policyDeatils);

	}
}
