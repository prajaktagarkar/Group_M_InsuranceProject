package com.insurance.repository;
/*Task 153
 * API Get All premium details
@authhor Prajakta Garkar

 */
import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Task153GetPremium;

@Repository
public interface Task153GetPremiumRepository extends CrudRepository<Task153GetPremium, Serializable> {

	public Task153GetPremium findById(Integer id);
}
