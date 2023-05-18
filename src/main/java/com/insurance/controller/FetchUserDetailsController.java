package com.insurance.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.FetchUserDetails;
import com.insurance.service.FetchUserDetailsService;


@RestController
//@RequestMapping("/UserDetails")
public class FetchUserDetailsController {
	
	
@Autowired	
	 private FetchUserDetailsService userDetailsService;

@GetMapping("/getalldata")
public List<FetchUserDetails>getAllPets() {
	 List<FetchUserDetails> user = userDetailsService.getAllUserData();				
	
	return user;
}
}