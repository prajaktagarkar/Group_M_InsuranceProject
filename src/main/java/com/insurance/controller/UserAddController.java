package com.insurance.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.insurance.model.ClaimAdd;

import com.insurance.model.UserAdd;
import com.insurance.repository.UserAddRepository;
import com.insurance.service.ClaimAddService;

import com.insurance.service.UserAddService;


@RestController

public class UserAddController {

	@Autowired
	private UserAddService userService;

	@Autowired
	private ClaimAddService claimService;

	@PostMapping("/saveuserpolicy")
	ResponseEntity<UserAdd> saveUser(@RequestBody UserAdd user) {
		UserAdd user1 = userService.saveUser(user);
		List<ClaimAdd> claims = user.getClaim();
		for (ClaimAdd claim : claims) {
			claim.setUserId(user.getUserId());
			claimService.saveClaim(claim);
		}

		return ResponseEntity.ok().body(user1);

	}

}
