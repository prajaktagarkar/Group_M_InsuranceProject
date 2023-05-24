package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Task174GetUser;
import com.insurance.service.Task174GetUserService;

@RestController
public class Task174GetUserController {
	@Autowired
	private Task174GetUserService userService;

	@GetMapping("/getUsersdata")
	public ResponseEntity<Task174GetUser> userDetails(@PathVariable("id") Integer id) {
		Task174GetUser getuser = userService.getAllUser(id);
		return ResponseEntity.ok().body(getuser);
	}

}
