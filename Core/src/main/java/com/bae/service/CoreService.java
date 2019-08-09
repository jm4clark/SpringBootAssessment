package com.bae.service;

import java.util.Collection;

public interface CoreService {
	public String createUser(Object user);

	public Object searchByName(String search);

	public Object searchById(int id);

	public Object userSearch(int memnum, String search);

	public Collection<Object> getAllSearches();
}
