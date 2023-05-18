package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Login;
import com.insurance.service.LoginService;

@RestController
@RequestMapping("/User")
public class LoginController {

	@Autowired
	private LoginService LoginService;
	
	
	@PostMapping("/save")
	
	public ResponseEntity<String> saveData(@RequestBody Login Login){
		@SuppressWarnings("unused")
		Login login= LoginService.saveData(Login);
		return ResponseEntity.ok().body("Registered Successfully");
	}
	
	@PutMapping("/login")
	public ResponseEntity<Login> getLoginData(@RequestBody Login Login){
		Login login1 = LoginService.getLogin(Login);
		return ResponseEntity.ok().body(login1);
	}
		  
}
