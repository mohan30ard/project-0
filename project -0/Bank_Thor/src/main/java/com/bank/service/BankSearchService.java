package com.bank.service;

import com.bank.exception.BankException;
import com.bank.model.Customer;


public interface BankSearchService {
	
	public Customer getByAccountNumber(long accountNumber) throws BankException;
	public Customer getPasswordByUserId(String userId) throws BankException;
	public double getBalanceByAccountNumber(long accountNumber) throws BankException;
	public String getPasswordByempId(String empId) throws BankException;
	
}
