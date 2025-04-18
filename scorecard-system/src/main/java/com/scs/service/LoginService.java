package com.scs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scs.model.User;
import com.scs.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
    private UserRepository userRepository;

	
	 public Optional<User> findByEmailAndPassword(String email, String password) {
	        return userRepository.findByEmailAndPassword(email, password);
	    }
}
