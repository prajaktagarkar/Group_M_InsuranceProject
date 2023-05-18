package com.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PremiumDetails;

@Repository
public interface PremiumDetailsRepository extends CrudRepository<PremiumDetails, Serializable> {
	@Query(value = "select * from policy_specificduration c where policy_commencement_date=?1", nativeQuery = true)
	List<PremiumDetails> getListByCommencementDate(String policyCommencementDate);

}
