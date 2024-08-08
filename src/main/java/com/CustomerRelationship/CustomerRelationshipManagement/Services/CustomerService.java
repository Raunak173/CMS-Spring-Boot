package com.CustomerRelationship.CustomerRelationshipManagement.Services;

import java.util.List;

import com.CustomerRelationship.CustomerRelationshipManagement.Entity.Customer;

public interface CustomerService {
	
	String insertCustomer(Customer customer);
	
	List<Customer> getCustomerList();
	
	Customer getCustomerById(int id);
	
	String updateCustomer(Customer customer);
	
}
