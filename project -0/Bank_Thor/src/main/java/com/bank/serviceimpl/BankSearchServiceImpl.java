package com.bank.serviceimpl;

import com.bank.dao.BankDAO;
import com.bank.daoimpl.BankDAOImpl;
import com.bank.exception.BankException;
import com.bank.model.Customer;
import com.bank.service.BankSearchService;

public class BankSearchServiceImpl implements BankSearchService{
	
	private BankDAO bankDAO=new BankDAOImpl();
	@Override
	public Customer getByAccountNumber(long accountNumber) throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getPasswordByUserId(String userId) throws BankException {
		Customer customer=null;
		if(userId==null) {
			throw new BankException("enter correct Userid");
		}else {
			customer=bankDAO.getPasswordByUserId(userId);
		}
		return customer;
	}

	@Override
	public double getBalanceByAccountNumber(long accountNumber) throws BankException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getPasswordByempId(String empId) throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

}
