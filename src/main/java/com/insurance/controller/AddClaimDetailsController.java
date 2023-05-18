package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.AddClaimDetails;
import com.insurance.service.AddClaimDetailsService;

@RestController
public class AddClaimDetailsController {

	@Autowired
	private AddClaimDetailsService addClaimDetailsService; 
	
	@PostMapping("/save")
	public ResponseEntity<AddClaimDetails> saveEmployee(@RequestBody AddClaimDetails addClaimDetails) {
		AddClaimDetails addClaimDetails1 =addClaimDetailsService.addDetaild(addClaimDetails);
		System.out.println(addClaimDetails1);
		return ResponseEntity.ok().body(addClaimDetails1);
}}
	 