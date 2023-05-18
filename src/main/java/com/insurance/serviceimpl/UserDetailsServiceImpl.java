package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserDetails;
import com.insurance.repository.UserDetailsRepository;
import com.insurance.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {
		return userDetailsRepository.save(userDetails);
		
	}

}
