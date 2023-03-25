package com.statefarm.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.statefarm.api.model.Agents;

public interface AgentRepository extends JpaRepository<Agents, Integer> {
	List<Agents> findByZipcode(Integer zipcode);
}
