package com.insurance.serviceimpl;
/*
 * Build the Restful API to get user details from database
 * @author Prajakta Garkar
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Task136GetUser;
import com.insurance.repository.Task136GetUserRepository;
import com.insurance.service.Task136GetUserService;

@Service
public class Task136GetUserServiceImpl implements Task136GetUserService{

	@Autowired
	private Task136GetUserRepository getUserRepository;
	@Override
	public Task136GetUser getUserDetails(Integer id) {
		Task136GetUser getUser=getUserRepository.findById(id);
		return getUser;
	}

}
