package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.CoreService;

@RestController
@RequestMapping("/pokeapi")
public class CoreController {

	CoreService service;

	@Autowired
	public CoreController(CoreService service) {
		this.service = service;
	}

	@PostMapping("/users/create")
	public String createUser(@RequestBody Object user) {
		return service.createUser(user);
	}

	@GetMapping("/search/name/{search}")
	public Object searchByName(@PathVariable("search") String search) {
		return service.searchByName(search);
	}

	@GetMapping("/search/id/{id}")
	public Object searchById(@PathVariable("id") int id) {
		return service.searchById(id);
	}

	@GetMapping("user/{memnum}/search/{search}")
	public Object userSearch(@PathVariable("memnum") int memnum, @PathVariable("search") String search) {
		return service.userSearch(memnum, search);
	}
}
