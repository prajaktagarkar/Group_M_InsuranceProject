package com.insurance.service;
/*
 * Task140 Send link to email
 * @author Prajakta
 */
import org.springframework.stereotype.Service;


public interface SendLinkService {
	
	public String sendLink(String email);

}
