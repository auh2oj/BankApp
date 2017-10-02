package com.web.bank.controller.model;

import java.util.Date;

import javax.persistence.Column;

public class CustomerForm {

	
	private String name;
	private int age;
	private String address;
	private String contact; //phone number
	private double loan; //loan amount
	private String ssn;
	private Date requestDate = new Date(); // date that request was sent
	// status can be Pending, Accepted, or Rejected depending on the discretion of the Bank Manager
	private String status = "Pending";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public double getLoan() {
		return loan;
	}
	public void setLoan(double loan) {
		this.loan = loan;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
