package com.insurance.controller;

import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Task157Premium;
import com.insurance.model.Task157User;
import com.insurance.service.Task157PremiumService;
import com.insurance.service.Task157UserSevice;



/*
 * Task157 Get User with multiple premium details

 * @Author Prajakta Garkar
 */

@RestController
@RequestMapping("/getInfo")
@CrossOrigin
public class Task157UserController {

	//Create object of Logger
//private static final Logger logger=LoggerFactory.getLogger(Task157UserController.class);
	@Autowired
	private Task157UserSevice userService;
	@Autowired
	private Task157PremiumService premiumService;
	@PostMapping("/saveUser")
	public ResponseEntity<Task157User>  saveDetails(@RequestBody Task157User user) {
		Task157User user1=userService.saveUser(user);
		List<Task157Premium> premium=user1.getPremium();
		for(Task157Premium premium1:premium) {
			premium1.setId(user.getId());
			premiumService.savePremium(premium1);
		}
		return ResponseEntity.ok().body(user1);
		
	}
	
	@GetMapping("/getuserwithpremium/{id}")
	public ResponseEntity<Task157User>  getDetails(@PathVariable ("id") Integer id) {
		Task157User user=userService.getUser(id);
	List<Task157Premium> premium=user.getPremium();
	for(Task157Premium premiunms:premium) {
		premiunms.setId(user.getId());
		
	premiumService.savePremium(premiunms);
	}
//	logger.info("Get user with multiple premium details");
	return ResponseEntity.ok().body(user);
	}
}

