package com.CSCI257.customerService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.CSCI257.customerService.dto.Account;
import com.CSCI257.customerService.dto.CustomerAccountDTO;
import com.CSCI257.customerService.model.Customer;
import com.CSCI257.customerService.repository.CustomerRepository;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Customer saveCustomer(Customer customer)
	{
		return repo.save(customer);
	}
	
	public Customer findCustomerById(int id)
	{
		return repo.findById(id);
	}
	
	public void deleteCustomerById(Integer id)
	{
		repo.deleteById(id);
	}
	
	public CustomerAccountDTO getCustomerWithAccount(int id)
	{
		CustomerAccountDTO response = new CustomerAccountDTO();
		Customer customer = repo.findById(id);
		Account account = restTemplate.getForObject("http://ACCOUNT-SERVICE/accounts/" + customer.getAccountId(), Account.class); 
		
		response.setAccount(account);
		response.setCustomer(customer);
		
		return response;
	}
	
}
