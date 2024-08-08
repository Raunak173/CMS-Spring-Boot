package com.CustomerRelationship.CustomerRelationshipManagement.Services;

import java.util.List;

import com.CustomerRelationship.CustomerRelationshipManagement.Entity.Customer;

public interface CustomerService {
	
	String insertCustomer(Customer customer);
	
	List<Customer> getCustomerList();
	
	Customer getCustomerById(int id);
	
	String updateCustomer(Customer customer);
	
	String deleteCustomer(int id);
	
	String insertMultipleCustomers(List<Customer> customers);
	
	List<Customer> getCustomerByFirstName(String firstName);
	
}
