package com.insurance.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Task165GeneratePDF;
import com.insurance.pdf.exporter.UserPDFExporter;
import com.insurance.service.Task165GeneratePDFService;
import com.lowagie.text.DocumentException;


@RestController
public class Task165GeneratePDFController {
	//Create object of logger
	//private static final Logger logger=LoggerFactory.getLogger(Task165GeneratePDFController.class);
	@Autowired
	private Task165GeneratePDFService pdfService;
	
	@GetMapping("/policy/pdf")
    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
         
        List<Task165GeneratePDF> listUsers = pdfService.listAll();
         
        UserPDFExporter exporter = new UserPDFExporter(listUsers);
   //     logger.info("Data from policy printed in pdf format");
        exporter.export(response);
         
    }

}
