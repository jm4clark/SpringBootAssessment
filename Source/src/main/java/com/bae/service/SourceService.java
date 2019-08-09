package com.bae.service;

import org.springframework.http.ResponseEntity;

public interface SourceService {

	public ResponseEntity<Object> getByName(String name);

	public ResponseEntity<Object> getById(int id);
}
