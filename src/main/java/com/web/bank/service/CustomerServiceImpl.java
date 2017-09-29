package com.web.bank.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.bank.controller.model.CustomerForm;
import com.web.bank.dao.CustomerDao;
import com.web.bank.model.Customer;

@Service("CustomerServiceImpl")
@Transactional(propagation=Propagation.REQUIRED)
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	@Qualifier("CustomerDaoImpl")
	CustomerDao customerDao;

	public String addCustomer(CustomerForm cf) {
		Customer customer = new Customer();
		BeanUtils.copyProperties(cf, customer);
		String result = customerDao.addCustomer(customer);
		return result;
	}

}
