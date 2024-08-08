package com.CustomerRelationship.CustomerRelationshipManagement.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerRelationship.CustomerRelationshipManagement.Dao.CustomerDao;
import com.CustomerRelationship.CustomerRelationshipManagement.Entity.Customer;
import com.CustomerRelationship.CustomerRelationshipManagement.Services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;

	@Override
	public String insertCustomer(Customer customer) {
		return customerDao.insertCustomer(customer);
	}
	
	@Override
	public List<Customer> getCustomerList(){
		return customerDao.getCustomerList();
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	@Override
	public String updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

}
