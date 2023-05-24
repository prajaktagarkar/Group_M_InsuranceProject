package com.insurance.controller;

/*
 * Task148 Delete Cliam
 * @Author Prajakta Garkar
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.Task148DeleteClaimService;

@RestController
public class Task148DeleteClaimController {

	@Autowired
	private Task148DeleteClaimService claimService;

	@DeleteMapping("/delete/{id}")
	public void deleteClaimDetailsById(@PathVariable("id") Integer id) {
		claimService.deleteClaimDetails(id);
	}
}
