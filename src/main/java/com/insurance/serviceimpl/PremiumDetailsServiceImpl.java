package com.insurance.serviceimpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.insurance.model.PremiumDetails;
import com.insurance.repository.PremiumDetailsRepository;
import com.insurance.service.PremiumDetailsService;

@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService {

	@Autowired
	private PremiumDetailsRepository premiumDetailsRepository;

	@Override
	public List<PremiumDetails> getListByCommencementDate(String policyCommencementDate) {
//		List<PremiumDetails> premiumDetails = premiumDetailsRepository
//				.getListByCommencementDate(policyCommencementDate);
		return  premiumDetailsRepository.getListByCommencementDate(policyCommencementDate);

	
	}

}
