package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.ClaimAdd;

@Repository
public interface ClaimAddRepository extends JpaRepository<ClaimAdd, Integer> {

}
