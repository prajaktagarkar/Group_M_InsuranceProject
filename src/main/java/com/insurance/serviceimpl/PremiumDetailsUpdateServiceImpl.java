package com.insurance.serviceimpl;
/*
 * task no.154 design the API update premium details into database
 * @author swati
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PremiumDetailsUpdate;
import com.insurance.repository.PremiumDetailsRepository;
import com.insurance.repository.PremiumDetailsUpdateRepository;
import com.insurance.service.PremiumDetailsUpdateService;

@Service
public class PremiumDetailsUpdateServiceImpl implements PremiumDetailsUpdateService {
	@Autowired
	private PremiumDetailsUpdateRepository premiumDetailsUpdateRepository;

	@Override
	public PremiumDetailsUpdate updatePremiumDetails(PremiumDetailsUpdate premiumDetailsUpdate) {
		PremiumDetailsUpdate premiumDetails1 = premiumDetailsUpdateRepository.findById(premiumDetailsUpdate.getId());
if(premiumDetails1!=null) {
	premiumDetails1.setPolicyHolderName(premiumDetailsUpdate.getPolicyHolderName());
	premiumDetailsUpdateRepository.save(premiumDetails1);
	return premiumDetails1;
	
}
		return null;
	}

}
