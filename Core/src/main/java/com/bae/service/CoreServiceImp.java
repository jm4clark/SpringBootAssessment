package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoreServiceImp implements CoreService {
	RestTemplate rest;

	@Autowired
	public CoreServiceImp(RestTemplate rest) {
		this.rest = rest;
	}

	@Override
	public String createUser(Object user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// HttpEntity<Object> request = new HttpEntity<Object>(user);

		String response = rest.postForObject("http://localhost:8082/users/create", user, String.class);

		return response;
	}

	@Override
	public Object searchByName(String search) {
		ResponseEntity<Object> searchResult = rest.exchange("http://localhost:8081/source/name/" + search,
				HttpMethod.GET, null, Object.class);

		return searchResult.getBody();
	}

	@Override
	public Object searchById(int id) {
		ResponseEntity<Object> searchResult = rest.exchange("http://localhost:8081/source/number/" + id, HttpMethod.GET,
				null, Object.class);

		return searchResult.getBody();
	}

	@Override
	public Object userSearch(int memnum, String search) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		rest.postForObject("http://localhost:8082/users/logsearch/" + memnum, search, String.class);

		return searchByName(search);
	}
}
