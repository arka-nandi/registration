package com.registration.form.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.registration.form.model.OnlineForm;

@Repository
public interface UserRepo extends CrudRepository<OnlineForm, Integer> {

	Optional<OnlineForm> findByEmail(String mail);

	
	

}
