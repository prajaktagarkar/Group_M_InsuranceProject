package com.insurance.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.PolicyDetailsExcelService;
@RestController
public class PolicyDetailsExcelController {
	// inject service here
	@Autowired
	private PolicyDetailsExcelService policyDetailsExcelService;

	// Design API to download all the matured policies details into excel file
	@GetMapping("/excel/{policyExpiryDate}")
	public void generateExcel(HttpServletResponse httpServletResponse,
			@PathVariable("policyExpiryDate") String policyExpiryDate) throws Exception {

		httpServletResponse.setContentType("application/octet-stream");

		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=matured_policy.xls";

		httpServletResponse.setHeader(headerKey, headerValue);

		policyDetailsExcelService.generateExcel(httpServletResponse, policyExpiryDate);
	}

}
