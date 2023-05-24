package com.insurance.controller;
/*
 * Build the Restful API to get user details from database
 * @author Prajakta Garkar
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Task136GetUser;
import com.insurance.service.Task136GetUserService;

@RestController
public class Task136GetUserController {
	@Autowired
	private Task136GetUserService getUserService;
	
	@GetMapping("/getUserDetails/{id}")
	public ResponseEntity<Task136GetUser> getUserDetailsById(@PathVariable ("id") Integer id) {
		Task136GetUser getuser=getUserService.getUserDetails(id);
		return ResponseEntity.ok().body(getuser);
	}

}
