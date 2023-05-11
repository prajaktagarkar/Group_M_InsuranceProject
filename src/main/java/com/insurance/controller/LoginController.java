package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Login;
import com.insurance.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	 @Autowired
	  private LoginService loginService;
	  
	  @PutMapping("/check/{id}")
	  public ResponseEntity<Login> getLogin(@PathVariable("id") Integer id,@RequestBody Login login){
		  Login log = loginService.getLogin(login, id);
		  return ResponseEntity.ok().body(log);
}}
