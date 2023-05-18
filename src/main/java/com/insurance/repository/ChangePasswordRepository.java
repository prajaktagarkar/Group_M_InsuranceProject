package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.insurance.model.ChangePassword;

@Repository
public interface ChangePasswordRepository extends JpaRepository<ChangePassword, Long> {

	
	ChangePassword findByPassword(String password);
}
