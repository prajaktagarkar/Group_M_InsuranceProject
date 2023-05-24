package com.insurance.controller;
//Task- 177: Design web service to get the settlement details.
//@author----->Poonam Patil

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.GetSettlementDetails;
import com.insurance.service.GetSettlementDetailsService;

@RestController
public class GetSettlementDetailsController {

	@Autowired
	private GetSettlementDetailsService getSettlementDetailsService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<GetSettlementDetails> getSettlementDetailsById1(@PathVariable("id") Integer id){
		GetSettlementDetails getSettlementDetails=	getSettlementDetailsService.getSettlementDetailsById(id);
		 return ResponseEntity.ok().body(getSettlementDetails);
}}
