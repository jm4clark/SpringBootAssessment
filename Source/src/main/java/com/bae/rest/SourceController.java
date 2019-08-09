package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.SourceService;

@RestController
@RequestMapping("/source")
public class SourceController {

	SourceService service;

	@Autowired
	public SourceController(SourceService service) {
		this.service = service;
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<Object> getByName(@PathVariable("name") String name) {
		return service.getByName(name);
	}

	@GetMapping("/number/{id}")
	public ResponseEntity<Object> getByName(@PathVariable("id") int id) {
		return service.getById(id);
	}
}
