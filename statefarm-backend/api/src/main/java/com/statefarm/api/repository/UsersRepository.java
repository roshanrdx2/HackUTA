package com.statefarm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.statefarm.api.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {


	Users findByEmailAndUserPassword(String username, String password);
	
}
