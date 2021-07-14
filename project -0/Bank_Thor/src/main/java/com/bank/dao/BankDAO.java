package com.bank.dao;

import java.util.List;

import com.bank.exception.BankException;
import com.bank.model.Account;
import com.bank.model.Customer;

public interface BankDAO {

	public Customer registerAccount(Customer customer) throws BankException;
	public Account createAccount(Account account) throws BankException;
	public List<Customer> getAllCustomers() throws BankException;
	public List<Account> getAllAccounts() throws BankException;
	public void deleteAccount(long accountNumber) throws BankException;
	public Account depositAmount(double amount) throws BankException;
	public Account withdrawAmount(double amount) throws BankException;
	public Account transferAmount(double amount) throws BankException;
	public Customer getByAccountNumber(long accountNumber) throws BankException;
	public Customer getPasswordByUserId(String userId) throws BankException;
	public double getBalanceByAccountNumber(long accountNumber) throws BankException;
	public String getPasswordByempId(String empId) throws BankException;
}
