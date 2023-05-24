package com.insurance.repository;
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.insurance.model.FetchUserDetails;


public interface FetchUserDetailsRepository extends CrudRepository<FetchUserDetails, Serializable>  {
//public  UserDetails	findById(Integer id);

}
