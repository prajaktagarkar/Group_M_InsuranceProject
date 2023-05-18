package com.insurance.repository;
/*
 * Task140 Send link to email
 * @author Prajakta
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.SendLink;

@Repository
public interface SendLinkRepository extends JpaRepository<SendLink, Long>{
	
	SendLink findByEmail(String email);

}
