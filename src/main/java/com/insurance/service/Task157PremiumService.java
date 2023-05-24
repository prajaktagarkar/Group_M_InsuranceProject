package com.insurance.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.insurance.model.Task157Premium;



/*
 * Task157 Get User with multiple premium details

 * @Author Prajakta Garkar
 */

public interface Task157PremiumService{
	
	public Task157Premium savePremium(Task157Premium premium);
	public Task157Premium getPremium(Integer id);

}
