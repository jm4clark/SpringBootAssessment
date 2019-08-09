package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.persistence.domain.AuditSearch;
import com.bae.persistence.repository.SearchRepo;

@Component
public class AuditController {

	@Autowired
	private SearchRepo repo;

	@JmsListener(destination = "SearchQueue", containerFactory = "myFactory")
	public void receiveMessage(AuditSearch search) {
		repo.save(search);
	}
}
