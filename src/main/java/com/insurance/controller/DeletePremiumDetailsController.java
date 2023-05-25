package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.DeletePremiumDetailsService;

@RestController

public class DeletePremiumDetailsController {
	@Autowired
	private DeletePremiumDetailsService deletePremiumDetailsService;

	@DeleteMapping("/deletedetails/{id}")
	public void deletePremiumDetails(@PathVariable("id") Integer id) {
		deletePremiumDetailsService.deletPremiumDetails(id);
	}

}
