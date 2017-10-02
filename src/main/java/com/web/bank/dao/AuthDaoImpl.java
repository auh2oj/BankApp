package com.web.bank.dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.web.bank.model.LoginEntity;

public class AuthDaoImpl extends HibernateDaoSupport implements AuthDao {

	public String authUser(String username, String password) {
		String role = "";
		List<LoginEntity> loginList = (List<LoginEntity>) super.getHibernateTemplate()
				.find("from LoginEntity where username=? and password=?", username, password);
		if (loginList.isEmpty()) return role;
		else {
			role = loginList.get(0).getRole();
			return role;
		}
	}

	public LoginEntity findRoleByUsername(String username) {
		LoginEntity login = null;
		List<LoginEntity> list = (List<LoginEntity>) getHibernateTemplate().find("from LoginEntity where username=?", username);
		if (list.isEmpty()){
			login = null;
		} else {
			login = list.get(0);
		}
		return login;
	}

	
	
}
