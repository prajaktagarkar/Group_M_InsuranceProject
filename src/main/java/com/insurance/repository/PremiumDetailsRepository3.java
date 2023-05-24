package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PremiumDetails3;

@Repository
public interface PremiumDetailsRepository3 extends CrudRepository<PremiumDetails3,Serializable> {

}
