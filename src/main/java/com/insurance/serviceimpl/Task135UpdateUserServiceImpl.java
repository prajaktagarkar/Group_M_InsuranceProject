package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Task135UpdateUser;

import com.insurance.repository.Task135UpdateUserRepository;
import com.insurance.service.Task135UpdateUserService;

@Service
public class Task135UpdateUserServiceImpl implements Task135UpdateUserService{
	
	@Autowired
	private Task135UpdateUserRepository updateuserrepository;

	@Override
	public Task135UpdateUser updateUserDetails(Integer id, Task135UpdateUser updateUser) {
		Task135UpdateUser updateuser1=updateuserrepository.findById(id);
		updateuser1.setName(updateUser.getName());
		updateuser1.setEmail(updateUser.getEmail());
		updateuser1.setDateOfBirth(updateUser.getDateOfBirth());
		updateuser1.setUserName(updateUser.getUserName());
		updateuser1.setPassword(updateUser.getPassword());
		Task135UpdateUser updateBranch2=updateuserrepository.save(updateuser1);
		return updateuser1;

	}

}
