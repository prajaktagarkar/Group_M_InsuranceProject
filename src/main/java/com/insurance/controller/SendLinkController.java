package com.insurance.controller;
/*
 * Task140 Send link to email
 * @author Prajakta
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.SendLinkService;

@RestController
public class SendLinkController {

	@Autowired
	private SendLinkService sendlinkservice;

	@PostMapping("/password")
	public String forgotPassword(@RequestParam String email) {

		String response = sendlinkservice.sendLink(email);

		if (!response.startsWith("Invalid")) {
			response = "http://localhost:8080/reset-password=" + response;
		}
		return response;
	}
	/*@PutMapping("/reset-password")
	public String resetPassword(@RequestParam String password) {

		return sendlinkservice.forgotPassword(password);
	}*/
}
