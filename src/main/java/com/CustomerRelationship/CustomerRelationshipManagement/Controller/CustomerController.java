package com.CustomerRelationship.CustomerRelationshipManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerRelationship.CustomerRelationshipManagement.Entity.Customer;
import com.CustomerRelationship.CustomerRelationshipManagement.Services.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {
		return customerService.insertCustomer(customer);
	}
	
	@GetMapping("")
	public List<Customer> getCustomerList(){
		return customerService.getCustomerList();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	
	@PutMapping("/update")
	public String customerUpdate(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return customerService.deleteCustomer(id);
	}
	
	@PostMapping("/insert/multiple")
	public String insertMultipleCustomers(@RequestBody List<Customer> customers) {
		return customerService.insertMultipleCustomers(customers);
	}
	
	@GetMapping("/byName/{firstName}")
	public List<Customer> getCustomersbyFirstName(@PathVariable String firstName){
		return customerService.getCustomerByFirstName(firstName);
	}
	

}
