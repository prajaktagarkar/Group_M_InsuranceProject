package com.insurance.service;

import java.util.List;

import com.insurance.model.Login;

public interface LoginService {
	public Login saveData(Login login);
	
	public Login getLogin(Login login);
}
