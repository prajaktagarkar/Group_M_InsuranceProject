package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PremiumDetails3;
import com.insurance.repository.PremiumDetailsRepository3;
import com.insurance.service.PremiumDetailsService3;
@Service
public class PremiumDetailsServiceImpl3 implements PremiumDetailsService3 {
	@Autowired
	private PremiumDetailsRepository3 premiumDetailsRepository;

	@Override
	public PremiumDetails3 savePremiumDetails(PremiumDetails3 premiumDetails) {
		return premiumDetailsRepository.save(premiumDetails);
				
	}

}
