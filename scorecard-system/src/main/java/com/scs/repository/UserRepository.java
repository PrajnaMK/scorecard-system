package com.scs.repository;

import com.scs.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
	 Optional<User> findByEmailAndPassword(String email, String password);
}

