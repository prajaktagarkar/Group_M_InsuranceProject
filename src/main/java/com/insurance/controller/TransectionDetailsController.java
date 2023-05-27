package com.insurance.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.TransectionDetails;
import com.insurance.service.TransectionDetailsService;

@RestController
public class TransectionDetailsController {
	@Autowired
	private TransectionDetailsService transectionDetailsService;
	
	@PutMapping("/updateTranectionData")
	public TransectionDetails updateTransectionDetails(@RequestBody TransectionDetails transectionDetails) { 
return transectionDetailsService.updateTransectionDetails(transectionDetails);
	}
}

