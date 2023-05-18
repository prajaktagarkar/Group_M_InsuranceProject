package com.insurance.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.insurance.model.ChangePassword;
import com.insurance.repository.ChangePasswordRepository;
import com.insurance.service.ChangePasswordService;
@Service
public class ChangePasswordImpl implements ChangePasswordService {

	@Autowired 
	private ChangePasswordRepository changepasswordrepository;
	@Override
	public String resetPassword(String password) {
		Optional<ChangePassword> changepasswordOptional = Optional
				.ofNullable(changepasswordrepository.findByPassword(password));

		if (!changepasswordOptional.isPresent()) {
			return "Invalid password.";
		}

		

		ChangePassword changepassword = changepasswordOptional.get();

		changepassword.setPassword(password);
		

		changepasswordrepository.save(changepassword);

		return "Your password successfully updated.";
	}

}
