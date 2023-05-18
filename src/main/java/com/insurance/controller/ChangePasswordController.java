package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.ChangePasswordService;

@RestController
public class ChangePasswordController {

	@Autowired
	private ChangePasswordService changepasswordservice;
	@PutMapping("/reset-password")
	public String resetPassword(@RequestParam String password) {

		return changepasswordservice.resetPassword(password);
	}
}
