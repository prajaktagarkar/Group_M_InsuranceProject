package com.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Task174GetUser;
import com.insurance.repository.Task174GetUserRepository;
import com.insurance.service.Task174GetUserService;

@Service
public class TAsk174getUserServiceImpl implements Task174GetUserService {

	@Autowired
	private Task174GetUserRepository userRepository;
	@Override
	public Task174GetUser getAllUser(Integer id) {
	Task174GetUser user=userRepository.findById(id);
	return user;
	}

}
