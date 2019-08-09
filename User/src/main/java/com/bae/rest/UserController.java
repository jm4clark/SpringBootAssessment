package com.bae.rest;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.persistence.domain.User;
import com.bae.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	UserService service;

	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public String createUser(@RequestBody User user) {
		service.createUser(user);
		return "user created!";
	}

	@GetMapping
	public Collection<User> getAllUsers() {
		return service.getAllUsers();
	}

	@GetMapping("/{id}")
	public Optional<User> getById(@PathVariable("id") int id) {
		return service.getById(id);
	}

	@GetMapping("/memnum/{id}")
	public Optional<User> getByMemNum(@PathVariable("id") int id) {
		return service.getByMemNum(id);
	}

}
