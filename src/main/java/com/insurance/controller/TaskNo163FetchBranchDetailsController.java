package com.insurance.controller;
//Task No 163: Design API to fetch branch details from system.
//@author Poonam Patil
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.TaskNo163FetchBranchDetails;
import com.insurance.service.TaskNo163FetchBranchDetailsService;

@RestController
public class TaskNo163FetchBranchDetailsController {
	
	@Autowired
 private TaskNo163FetchBranchDetailsService taskNo163FetchBranchDetailsService;
	
	@GetMapping("/getdetails/{id}")
	public ResponseEntity<TaskNo163FetchBranchDetails> getDetailsofTask163(@PathVariable("id")Integer id) {
		TaskNo163FetchBranchDetails task163=taskNo163FetchBranchDetailsService.getTaskNo163FetchBranchDetailsById(id);
		return ResponseEntity.ok().body(task163);
		
	}
}
