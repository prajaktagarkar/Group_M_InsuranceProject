package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Task134AddUser;

import com.insurance.service.Task134AddUserService;

@RestController
public class Task134AddUserController {
	
	@Autowired
	private Task134AddUserService adduserservice;

	@PostMapping("/addUserDetails")
	ResponseEntity<Task134AddUser> saveUser(@RequestBody Task134AddUser user) {
		Task134AddUser user1 = adduserservice.saveUsers(user);
		
		return ResponseEntity.ok().body(user1);

	}

}
