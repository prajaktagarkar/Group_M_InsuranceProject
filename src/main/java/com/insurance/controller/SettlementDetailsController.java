package com.insurance.controller;
//Task- 175 Design web service to add the settlement details once claim is done ------>
//@author----->Poonam Patil

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.insurance.model.SettlementDetails;
import com.insurance.service.SettlementDetailsService;

@RestController
public class SettlementDetailsController {

	@Autowired
	private SettlementDetailsService settlementDetailsService;

	@PostMapping("/SettlementDetails")
	public SettlementDetails saveAllsettlementDetails(@RequestBody SettlementDetails settlementDetails) {

		SettlementDetails save = settlementDetailsService.saveSettlementDetails(settlementDetails);
		return save;

	}
}
