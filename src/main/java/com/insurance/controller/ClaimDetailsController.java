package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.ClaimDetails;
import com.insurance.service.ClaimDetailsService;
@RestController
public class ClaimDetailsController {
	@Autowired
	private ClaimDetailsService claimDetailsService;
	
	@PutMapping("/updateClaimData")
	public ClaimDetails updateClaimDetails(@RequestBody ClaimDetails claimDetails) {
		return claimDetailsService.updateClaimDetails(claimDetails);

}
}