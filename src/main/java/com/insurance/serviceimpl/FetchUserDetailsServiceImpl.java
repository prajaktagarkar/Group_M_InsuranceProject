package com.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.FetchUserDetails;
import com.insurance.repository.FetchUserDetailsRepository;
import com.insurance.service.FetchUserDetailsService;


@Service
public class FetchUserDetailsServiceImpl implements FetchUserDetailsService {
	@Autowired
private FetchUserDetailsRepository UserDetailsRepository;
	
	@Override
	public List<FetchUserDetails> getAllUserData() {
		
		return (List<FetchUserDetails>)UserDetailsRepository.findAll();
	}

	

}
