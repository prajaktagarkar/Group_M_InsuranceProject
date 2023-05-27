package com.insurance.serviceimpl;

import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Task157Premium;
import com.insurance.repository.Task157PremiumRepository;
import com.insurance.service.Task157PremiumService;



/*
 * Task157 Get User with multiple premium details

 * @Author Prajakta Garkar
 */
@Service
public class Task157PremiumServiceImpl implements Task157PremiumService {

	//Create object of Logger
	//private static final Logger logger=LoggerFactory.getLogger(Task157PremiumServiceImpl.class);
	@Autowired
	private Task157PremiumRepository premiumRepository;

	
	@Override
	public Task157Premium savePremium(Task157Premium premium) {
	
		return premiumRepository.save(premium)	;
	}

	@Override
	public Task157Premium getPremium(Integer id) {
		Task157Premium premium1=premiumRepository.findById(id);
		return null;
	}


	
	
	
}
