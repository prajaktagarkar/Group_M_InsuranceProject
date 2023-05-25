package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.AddBranchDetails;
import com.insurance.repository.AddBranchDetailsRepository;
import com.insurance.service.AddBranchDetailsService;
@Service
public class AddBranchDetailsServiceImpl implements AddBranchDetailsService {
	@Autowired
private AddBranchDetailsRepository addBranchDetailsRepository;

	@Override
	public AddBranchDetails saveBranchDetails(AddBranchDetails addBranchDetails) {
		 AddBranchDetails addBranchDetails1= addBranchDetailsRepository.save(addBranchDetails);
		return addBranchDetails1;
	}
	
	
	
	

}
