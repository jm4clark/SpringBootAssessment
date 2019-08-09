package com.bae.service;

import java.util.Collection;
import java.util.Optional;

import com.bae.persistence.domain.User;

public interface UserService {

	public User createUser(User user);

	public Collection<User> getAllUsers();

	public Optional<User> getById(int id);

	public Optional<User> getByMemNum(int num);

	public void logSearch(int memNum, String search);

}