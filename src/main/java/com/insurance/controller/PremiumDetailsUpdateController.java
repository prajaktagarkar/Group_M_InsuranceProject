package com.insurance.controller;

/*
 * task no.154 design the API update premium details into database
 * @author swati
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PremiumDetailsUpdate;
import com.insurance.service.PremiumDetailsUpdateService;

@RestController
public class PremiumDetailsUpdateController {
	@Autowired
	private PremiumDetailsUpdateService premiumDetailsService;

	@PutMapping("/updatePremiumData")
	public PremiumDetailsUpdate updatePremiumDetails(@RequestBody PremiumDetailsUpdate premiumDetails) {
		return premiumDetailsService.updatePremiumDetails(premiumDetails);

	}

}
