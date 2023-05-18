package com.insurance.service;

import com.insurance.model.Login;

public interface LoginService {
	public Login saveData(Login login);
	
	public Login getLogin(Login login);
}
