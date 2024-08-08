package com.CustomerRelationship.CustomerRelationshipManagement.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CustomerRelationship.CustomerRelationshipManagement.Entity.Customer;

@Repository
public class CustomerDao {
	
	//Code for database
	
	@Autowired
	SessionFactory sf;
	
	public String insertCustomer(Customer customer) {
		
		Session session = sf.openSession();
		//insert, update,delete -> use transactions
		Transaction tr = session.beginTransaction();
		session.save(customer);
		tr.commit();
		session.close();
		return "Customer inserted successfully";
	}
	
	public List<Customer> getCustomerList() {
		
		Session session = sf.openSession();
		return session.createQuery("from Customer").list(); 
		//This will give us a list of all the customers
	}
	
	public Customer getCustomerById(int id) {
		Session session = sf.openSession();
		return session.get(Customer.class, id);
	}
	
	public String updateCustomer(Customer customer) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
		return "Customer updated successfully";
	}
}
