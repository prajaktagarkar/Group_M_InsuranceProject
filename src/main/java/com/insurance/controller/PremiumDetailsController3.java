package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PremiumDetails3;
import com.insurance.service.PremiumDetailsService3;

@RestController
public class PremiumDetailsController3 {
	@Autowired
	private PremiumDetailsService3 premiumDetailsService;
@PostMapping("/save")
	public ResponseEntity<PremiumDetails3> savePremiumDetails(@RequestBody PremiumDetails3 premiumDetails) {
		PremiumDetails3 premiumDetails1 = premiumDetailsService.savePremiumDetails(premiumDetails);
		return ResponseEntity.ok().body(premiumDetails1);
	}
}
