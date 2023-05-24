package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.DeletePremiumDetailsRepository;
import com.insurance.service.DeletePremiumDetailsService;


@Service
public class DeletePremiumDetailsServiceImpl implements DeletePremiumDetailsService {
	@Autowired
	private DeletePremiumDetailsRepository deletePremiumDetailsRepository;

	@Override
	public void deletPremiumDetails(Integer Id) {
		if(Id!= null) {
			deletePremiumDetailsRepository.deleteById(Id);	
		}else {
			throw new NullPointerException("given id is null");
		}
	}
		
	}

	
	

