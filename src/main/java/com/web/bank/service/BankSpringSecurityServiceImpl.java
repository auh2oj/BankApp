package com.web.bank.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.web.bank.dao.AuthDao;
import com.web.bank.model.LoginEntity;

//@Service("BankSpringSecurityServiceImpl")
//@Scope("singleton")
public class BankSpringSecurityServiceImpl implements UserDetailsService {

//	@Autowired
//	@Qualifier("AuthDaoImpl")
	AuthDao authDao;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails user = null;
		LoginEntity login = authDao.findRoleByUsername(username);
		if (login == null) {
			throw new UsernameNotFoundException("Username does not exist.");
		} else {
			 user = new User(username, login.getPassword(), true, true, true, true, getAuthorities(login.getRole()));
		}
		System.out.println("Login: " + login);
		System.out.println("User: " + user);
		return user;
	}
	
	/**
	 * Retrieves the correct ROLE type depending on the access level, where access level is an Integer.
	 * Basically, this interprets the access value whether it's for a regular user or admin.
	 * 
	 * @param access an integer value representing the access of the user
	 * @return collection of granted authorities
	 */
	 public Collection<GrantedAuthority> getAuthorities(String role) {
			List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
			authList.add(new GrantedAuthorityImpl(role));
			return authList;
	  }

}
