package com.CSCI257.accountService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CSCI257.accountService.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	public Account findById(int id);

}
