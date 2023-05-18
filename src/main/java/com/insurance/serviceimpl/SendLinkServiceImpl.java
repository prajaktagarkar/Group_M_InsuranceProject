package com.insurance.serviceimpl;
/*
 * Task140 Send link to email
 * @author Prajakta
 */
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.SendLink;
import com.insurance.repository.SendLinkRepository;
import com.insurance.service.SendLinkService;

@Service
public class SendLinkServiceImpl implements SendLinkService{

	
	

	@Autowired 
	
	private SendLinkRepository sendlinkrepository;
	
	@Override
	public String sendLink(String email) {

		Optional<SendLink> userOptional = Optional
				.ofNullable(sendlinkrepository.findByEmail(email));

		if (!userOptional.isPresent()) {
			return "Invalid email id.";
		}

		
		return " ";
	}
	

	
}
