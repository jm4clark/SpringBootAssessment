package com.bae.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bae.persistence.domain.User;
import com.bae.persistence.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	UserRepository repo;
	RestTemplate restTemplate;
	// JmsTemplate jmsTemplate

	@Autowired
	public UserServiceImp(UserRepository repo, RestTemplate rest) {
		this.repo = repo;
		this.restTemplate = rest;
		// this.jmsTempalte = jms;
	}

	@Override
	public User createUser(User user) {
		return repo.save(user);
	}

	@Override
	public Collection<User> getAllUsers() {
		return repo.findAll();
	}

	@Override
	public Optional<User> getById(int id) {
		return repo.findById(id);
	}

	@Override
	public Optional<User> getByMemNum(int num) {
		return repo.findByMemberNumber(num);
	}

}
