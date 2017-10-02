package com.web.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.bank.dao.AuthDao;

@Service("AuthServiceImpl")
@Transactional(propagation=Propagation.REQUIRED)
public class AuthServiceImpl implements AuthService {

	@Autowired
	@Qualifier("AuthDaoImpl")
	private AuthDao authDao;

	public String authUser(String username, String password) {
		return authDao.authUser(username, password);
	}
	
}
