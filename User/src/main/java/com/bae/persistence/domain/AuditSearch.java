package com.bae.persistence.domain;

import java.sql.Timestamp;

public class AuditSearch {

	private int userID;
	private String userName;
	private int userMemNum;

	private Timestamp timestamp;

	private String search;

	public AuditSearch(int id, String username, int memnum, String search, Timestamp timestamp) {
		this.userID = id;
		this.userName = username;
		this.userMemNum = memnum;
		this.search = search;
		this.timestamp = timestamp;
	}

	public AuditSearch() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserMemNum() {
		return userMemNum;
	}

	public void setUserMemNum(int userMemNum) {
		this.userMemNum = userMemNum;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}
