package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.NomineeService;
import com.insurance.service.UserService;

@RestController
@RequestMapping("/delete")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private NomineeService nomineeService;
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUserDetails(@PathVariable("id")Integer id) {
		nomineeService.deleteNominee(id);
		userService.deleteUser(id);
	}
	
}
