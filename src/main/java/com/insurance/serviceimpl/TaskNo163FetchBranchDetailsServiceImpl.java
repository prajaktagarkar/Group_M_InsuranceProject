package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.TaskNo163FetchBranchDetails;
import com.insurance.repository.TaskNo163FetchBranchDetailsRepository;
import com.insurance.service.TaskNo163FetchBranchDetailsService;

@Service
public class TaskNo163FetchBranchDetailsServiceImpl implements TaskNo163FetchBranchDetailsService {
	@Autowired
	private TaskNo163FetchBranchDetailsRepository taskNo163FetchBranchDetailsRepository;

	@Override
	public TaskNo163FetchBranchDetails getTaskNo163FetchBranchDetailsById(Integer Id) {
		TaskNo163FetchBranchDetails Tk163= taskNo163FetchBranchDetailsRepository.findById(Id);
		return Tk163;
	}

}
