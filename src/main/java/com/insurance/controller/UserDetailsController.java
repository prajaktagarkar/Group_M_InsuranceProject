package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyPremiumDetails;
import com.insurance.model.UserDetails;
import com.insurance.service.PolicyPremiumDetailsService;
import com.insurance.service.UserDetailsService;

@RestController
@RequestMapping("/save")
public class UserDetailsController {
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private PolicyPremiumDetailsService policyPremiumDetailsService;

	@PostMapping("/saveuserdetails")
	public ResponseEntity<UserDetails> saveAllUserDetails(@RequestBody UserDetails userDetails) {
		UserDetails user= userDetailsService.saveUserDetails(userDetails);
		List<PolicyPremiumDetails> policy= userDetails.getPolicyPremiumDetailsList();
		 for(PolicyPremiumDetails policyPremiumDetails:policy ) {
			 policyPremiumDetails.setUserId(userDetails.getId());
			 policyPremiumDetailsService.savePolicyPremiumDetails(policyPremiumDetails);
		 }
		 return ResponseEntity.ok().body(user);
		 
	}
}