package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.ClaimDetails;
import com.insurance.repository.ClaimDetailsRepository;
import com.insurance.service.ClaimDetailsService;


@Service
public class ClaimDetailsServiceImpl implements ClaimDetailsService {
	
	@Autowired
	private ClaimDetailsRepository claimDetailsRepository;
	@Override
	public ClaimDetails updateClaimDetails(ClaimDetails claimDetails) {
		ClaimDetails claimDetail1 = claimDetailsRepository.findById(claimDetails.getId()).orElse(null);
		if(claimDetail1 != null) {
			claimDetail1.setClaimStatus(claimDetails.getClaimStatus());
			claimDetailsRepository.save(claimDetail1);
			return claimDetail1;
			
		}
		return null;
	}
	
	
	
	

}
