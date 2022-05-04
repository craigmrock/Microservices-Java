package com.CSCI257.customerService.dto;

import com.CSCI257.customerService.model.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAccountDTO {
	private Customer customer;
	private Account account;

}
