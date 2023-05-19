package com.insurance.repository;
/*
 * Task148 Delete Cliam
 * @Author Prajakta Garkar
 */
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Task148DeleteClaim;

@Repository
public interface Task148DeleteClaimRepository extends JpaRepository<Task148DeleteClaim, Integer> {

	
	void deleteById(Integer id);
}
