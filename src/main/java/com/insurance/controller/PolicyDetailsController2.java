package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyDetails2;
import com.insurance.service.PolicyDetailsService2;

@RestController
public class PolicyDetailsController2 {
	
	@Autowired
	private PolicyDetailsService2 policyDetailsService;
	@DeleteMapping("/delete/{id}")
	public void deletePolicyDetails(@PathVariable Integer id)  {
		policyDetailsService.deletePolicyDetails(id);
	

}
}