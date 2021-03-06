package com.web.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.bank.controller.model.CustomerForm;
import com.web.bank.service.CustomerService;

@Controller
public class CustomerRestController {
	
	@Autowired
	@Qualifier("CustomerServiceImpl")
	private CustomerService customerService;
	
	@RequestMapping(value="register.do", method=RequestMethod.POST,
			consumes = {"application/json", "application/xml"},
			produces = {"application/json", "application/xml"})
	@ResponseBody public String addEmployee(@RequestBody CustomerForm cf) {
		System.out.println("In Rest API, Customer data:");
		System.out.println(cf);
		return customerService.addCustomer(cf);
	}
}
