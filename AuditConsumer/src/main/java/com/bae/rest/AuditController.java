package com.bae.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.persistence.domain.AuditSearch;
import com.bae.persistence.repository.SearchRepo;

@Component
@RestController
@RequestMapping("/audits")
public class AuditController {

	@Autowired
	private SearchRepo repo;

	@JmsListener(destination = "SearchQueue", containerFactory = "myFactory")
	public void receiveMessage(AuditSearch search) {
		repo.save(search);
	}

	@GetMapping("/getAllSearches")
	public Collection<AuditSearch> getAllSearches() {
		return repo.findAll();
	}

}
