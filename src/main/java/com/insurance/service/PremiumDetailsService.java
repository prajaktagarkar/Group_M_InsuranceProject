package com.insurance.service;


import java.util.List;

import com.insurance.model.PremiumDetails;

public interface PremiumDetailsService {
	
	public List<PremiumDetails> getListByCommencementDate(String policyCommencementDate);
}
