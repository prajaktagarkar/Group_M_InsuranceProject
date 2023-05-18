package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Serializable>{

}
