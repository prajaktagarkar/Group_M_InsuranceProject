package com.insurance.serviceimpl;

import java.util.List;

import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Login;
import com.insurance.repository.LoginRepository;
import com.insurance.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository LoginRepository;

	@Override
	public Login saveData(Login Login) {
		Login stud = LoginRepository.save(Login);
		return stud;
	}

	@Override
	public Login getLogin(Login Login) {
		List<Login> getList = LoginRepository.findAll();
		String str = null;
		String str1 = null;
		String s = Login.getUserId();
		String s1 = Login.getPassword();
		for(Login stud : getList) {
		    str = stud.getUserId();
		    str1 = stud.getPassword();
		}
		if(str.equals(s) && str1.equals(s1)) {
		    throw new IllegalIdentifierException("Login Successfully");
		}else {
			throw new IllegalIdentifierException("Account Not Found");
		}
		
	}
}
