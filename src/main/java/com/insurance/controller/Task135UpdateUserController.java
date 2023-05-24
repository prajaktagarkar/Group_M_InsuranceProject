package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Task135UpdateUser;

import com.insurance.service.Task135UpdateUserService;

@RestController
public class Task135UpdateUserController {
	@Autowired
	private Task135UpdateUserService updateUserService;

	@PutMapping("/updateuserdetails/{id}")
	public ResponseEntity<Task135UpdateUser> updateuserdetails(@PathVariable("id") Integer id,
			@RequestBody Task135UpdateUser updateUser) {
		Task135UpdateUser updateUser2 =updateUserService.updateUserDetails(id, updateUser);
		return ResponseEntity.ok().body(updateUser2);
	}

}
