package com.insurance.repository;

/*
 * task no.154 design the API update premium details into database
 * @author swati
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PremiumDetailsUpdate;

@Repository
public interface PremiumDetailsUpdateRepository extends CrudRepository<PremiumDetailsUpdate, Integer> {
	public PremiumDetailsUpdate findById(int id);
}
