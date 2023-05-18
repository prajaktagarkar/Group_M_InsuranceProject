package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserAdd;
import com.insurance.repository.UserAddRepository;
import com.insurance.service.UserAddService;

@Service
public class UserAddServiceImpl implements UserAddService {

	@Autowired
	private UserAddRepository userRepository;
	@Override
	public UserAdd saveUser(UserAdd user) {

UserAdd user1=userRepository.save(user);
		return user1;
	}

}
