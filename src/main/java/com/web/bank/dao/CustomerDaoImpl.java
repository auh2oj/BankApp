package com.web.bank.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.web.bank.model.Customer;

@Repository("CustomerDaoImpl")
@Scope("singleton")
@Transactional
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
	
	@Autowired
	@Qualifier("customerSessionFactory")
	public void setCustomerSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public String addCustomer(Customer c) {
		super.getHibernateTemplate().save(c);
		return "Success";
	}

}
