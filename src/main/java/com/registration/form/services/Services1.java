package com.registration.form.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.form.model.OnlineForm;
import com.registration.form.repository.UserRepo;

@Service
public class Services1 {
	
	@Autowired
	UserRepo repo;
	public void save(OnlineForm of) {
	repo.save(of);
	}	
	

}
