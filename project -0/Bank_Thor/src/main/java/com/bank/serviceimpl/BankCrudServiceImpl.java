package com.bank.serviceimpl;

import java.util.List;

import com.bank.dao.BankDAO;
import com.bank.daoimpl.BankDAOImpl;
import com.bank.exception.BankException;
import com.bank.model.Account;
import com.bank.model.Customer;
import com.bank.service.BankCrudService;

public class BankCrudServiceImpl implements BankCrudService{
	private BankDAO bankDAO=new BankDAOImpl();
	@Override
	public Customer registerAccount(Customer customer) throws BankException {
		
			if(customer!=null) {
			customer =bankDAO.registerAccount(customer);
			}else {
				throw new BankException("not registered");
			}
		return customer;
	}
	@Override
	public Account createAccount(Account account) throws BankException {
			
		if(account!=null) {
			account=bankDAO.createAccount(account);
		}else {
			throw new BankException("Account Not Opened");
		}
		return account;
	}
	@Override
	public List<Customer> getAllCustomers() throws BankException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Account> getAllAccounts() throws BankException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAccount(long accountNumber) throws BankException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Account depositAmount(double amount) throws BankException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Account withdrawAmount(double amount) throws BankException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Account transferAmount(double amount) throws BankException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
