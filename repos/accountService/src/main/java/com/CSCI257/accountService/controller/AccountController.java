package com.CSCI257.accountService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CSCI257.accountService.model.Account;
import com.CSCI257.accountService.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService service;
	
	@PostMapping("/")
	public Account postAccount(@RequestBody Account account)
	{
		return service.saveAccount(account);
	}
	
	@GetMapping("/{id}")
	public Account getAccountById(@PathVariable("id") int id)
	{
		return service.findAccountById(id);
	}
}
