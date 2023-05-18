package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PremiumDetails;
import com.insurance.service.PremiumDetailsService;

@RestController
//@ComponentScan(basePackages = "com.insurance.service")
public class PremiumDetailsController {

	@Autowired
	private PremiumDetailsService premiumDetailsService;

	@GetMapping("/getpremiumdetails/{policyCommencementDate}")
	public ResponseEntity<List<PremiumDetails>> getListByCommencementDate(
			@PathVariable("policyCommencementDate") String policyCommencementDate) {
		List<PremiumDetails> premiumDetails = premiumDetailsService.getListByCommencementDate(policyCommencementDate);
		return ResponseEntity.ok().body(premiumDetails);

	}
}
