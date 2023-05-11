package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Login;
import com.insurance.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	@Override
	public Login getLogin(Login login, Integer id) {
		Login log = loginRepository.findById(id);
		if(log == null) {
			return log;
		}else {
		if(log.getUserId().equals(login.getUserId()) && log.getPassword().equals(login.getPassword())) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Invalid Details");
		}
		}
		return log;
		
	}

}
