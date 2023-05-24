package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.NomineeRepository;
import com.insurance.service.NomineeService;
@Service
public class NomineeServiceImpl implements NomineeService {
@Autowired
	private NomineeRepository nomineeRepository;
	
	@Override
	public void deleteNominee(Integer id) {
		nomineeRepository.findById(id);
		
	}

}
