package com.insurance.serviceimpl;
/*
 * Task148 Delete Cliam
 * @Author Prajakta Garkar
 */
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Task148DeleteClaim;
import com.insurance.repository.Task148DeleteClaimRepository;
import com.insurance.service.Task148DeleteClaimService;

@Service
public class Task148DeleteClaimServiceImpl implements Task148DeleteClaimService {

	@Autowired
	private Task148DeleteClaimRepository claimRepository;

	public Optional < Task148DeleteClaim > findById(int id) {
        return claimRepository.findById(id);
    }
	@Override
	public Task148DeleteClaim deleteClaimDetails(Integer id) {
		if (id !=null) {
			
			claimRepository.deleteById(id);
			System.out.println("Deleted Successfully....");

		} else {
			System.out.println("Given id is not present...");
			throw new IllegalArgumentException(" Given id is not present");
		}
		
		return null;
	}

}
