package com.bae.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.persistence.domain.AuditSearch;

@Repository
public interface SearchRepo extends MongoRepository<AuditSearch, Long> {
}