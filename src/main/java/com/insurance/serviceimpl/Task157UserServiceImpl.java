package com.insurance.serviceimpl;

import java.util.Optional;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Task157User;
import com.insurance.repository.Task157UserRepository;
import com.insurance.service.Task157UserSevice;


/*
 * Task157 Get User with multiple premium details

 * @Author Prajakta Garkar
 */
@Service
public class Task157UserServiceImpl implements Task157UserSevice{

	//Create object of Logger
	//private static final Logger logger=LoggerFactory.getLogger(Task157UserServiceImpl.class);
	@Autowired
	private Task157UserRepository userRepository;
	

	@Override
	public Task157User saveUser(Task157User user) {
		
		return userRepository.save(user);
	}
	
	@Override
	public Task157User getUser(Integer id) {
		Task157User user=userRepository.findById(id);
		//logger.info("Get User by id");
		return user;
	}



	

}
