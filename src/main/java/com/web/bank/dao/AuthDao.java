package com.web.bank.dao;

import com.web.bank.model.LoginEntity;

public interface AuthDao {

	public String authUser(String username, String password);

	public LoginEntity findRoleByUsername(String username);
	
}
