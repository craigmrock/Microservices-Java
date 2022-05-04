package com.CSCI257.accountService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CSCI257.accountService.model.Account;
import com.CSCI257.accountService.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repo;
	
	public Account saveAccount(Account account) 
	{
		return repo.save(account);
	}
	
	public Account findAccountById(int id)
	{
		return repo.findById(id);
	}

}
