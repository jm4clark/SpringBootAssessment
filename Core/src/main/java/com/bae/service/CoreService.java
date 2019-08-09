package com.bae.service;

public interface CoreService {
	public String createUser(Object user);

	public Object searchByName(String search);

	public Object searchById(int id);

	public Object userSearch(int memnum, String search);
}
