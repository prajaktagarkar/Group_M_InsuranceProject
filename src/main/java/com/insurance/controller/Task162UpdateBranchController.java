package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Task162UpdateBranch;
import com.insurance.service.Task162UpdateBranchService;

@RestController
public class Task162UpdateBranchController {

	@Autowired
	private Task162UpdateBranchService updateBranchService;

	@PutMapping("/updatedetails/{id}")
	public ResponseEntity<Task162UpdateBranch> updatePolicyScheduleDetails1(@PathVariable("id") Integer id,
			@RequestBody Task162UpdateBranch updateBranch) {
		Task162UpdateBranch updateBranch2 = updateBranchService.updateBranchDetails(id, updateBranch);
		return ResponseEntity.ok().body(updateBranch2);
	}
}
