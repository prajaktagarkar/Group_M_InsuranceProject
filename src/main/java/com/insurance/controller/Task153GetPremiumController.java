package com.insurance.controller;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
/*Task 153
 * API Get All premium details
@authhor Prajakta Garkar

 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Task153GetPremium;
import com.insurance.service.Task153GetPremiumService;

@RestController
public class Task153GetPremiumController {

	
	//Create a object of Logger
	//private static final Logger logger=LoggerFactory.getLogger(Task153GetPremiumController.class);
	@Autowired
	private Task153GetPremiumService task153service;
	
@GetMapping("/getpremium/{id}")
	public ResponseEntity<Task153GetPremium> getPremiumById(@PathVariable("id") Integer id){
		Task153GetPremium premium=task153service.getPremiumDetailById(id);
	//	logger.info("Task153,Get Premium Details");
		return ResponseEntity.ok().body(premium);
	}
}
