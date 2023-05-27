package com.insurance.serviceimpl;

/*Task 153
 * API Get All premium details
@authhor Prajakta Garkar

 */
import java.util.Optional;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Task153GetPremium;
import com.insurance.repository.Task153GetPremiumRepository;
import com.insurance.service.Task153GetPremiumService;

@Service
public class Task153GetPremiumServiceImpl implements Task153GetPremiumService {
	
	//Create object of Logger
	//private static final Logger logger=LoggerFactory.getLogger(Task153GetPremiumServiceImpl.class);
	@Autowired
	private Task153GetPremiumRepository task153premiumrepository;

	@Override
	public Task153GetPremium getPremiumDetailById(Integer id) {
		Task153GetPremium premium=task153premiumrepository.findById(id);
		//logger.info("Getting premium details by id");
			return premium;
	}

}
