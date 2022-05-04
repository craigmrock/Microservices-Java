package com.CSCI257.customerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CSCI257.customerService.dto.CustomerAccountDTO;
import com.CSCI257.customerService.model.Customer;
import com.CSCI257.customerService.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/")
	public Customer postCustomer(@RequestBody Customer customer) 
	{
		return service.saveCustomer(customer);
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable("id") int id) 
	{
		return service.findCustomerById(id);
		
	}
	
	//host:port/customer/account/a
	@GetMapping("/account/{id}")
	public CustomerAccountDTO getCustomerWithAccount(@PathVariable("id") int id)
	{
		return service.getCustomerWithAccount(id);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteCustomerById(@PathVariable("id") int id)
	{
		service.deleteCustomerById(id);
		
	}
	
	@PutMapping("/{id}")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return service.saveCustomer(customer);
	}

}
