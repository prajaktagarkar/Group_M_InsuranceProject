package com.insurance.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.AddBranchDetails;
import com.insurance.service.AddBranchDetailsService;


@RestController
public class AddBranchDetailsController {
	@Autowired
	private AddBranchDetailsService addBranchDetailsService;

	@PostMapping("/addbranchdata")
	public AddBranchDetails saveBranchDetails(@RequestBody AddBranchDetails addBranchDetails) {
		 AddBranchDetails addBranchDetails1 = addBranchDetailsService.saveBranchDetails(addBranchDetails);
		return addBranchDetails1;
	}
}
