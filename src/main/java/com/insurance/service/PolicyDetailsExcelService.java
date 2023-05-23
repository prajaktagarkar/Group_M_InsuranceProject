package com.insurance.service;

//TaskNo:166 DesignApi to Download all te matured policies details into excel file.
//@Author Poonam Patil

import javax.servlet.http.HttpServletResponse;

public interface PolicyDetailsExcelService {
	public void generateExcel(HttpServletResponse httpServletResponse, String policyExpiryDate) throws Exception;

	
}
