package com.bank.service;

import java.util.List;

import com.bank.exception.BankException;
import com.bank.model.Account;
import com.bank.model.Customer;


public interface BankCrudService {

	public Customer registerAccount(Customer customer) throws BankException;
	public Account createAccount(Customer customer) throws BankException;
	public List<Customer> getAllCustomers() throws BankException;
	public List<Account> getAllAccounts() throws BankException;
	public void deleteAccount(long accountNumber) throws BankException;
	public Account depositAmount(double amount) throws BankException;
	public Account withdrawAmount(double amount) throws BankException;
	public Account transferAmount(double amount) throws BankException;
}
