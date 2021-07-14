package com.bank.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.bank.dao.BankDAO;
import com.bank.dbutil.PostgresConnection;
import com.bank.exception.BankException;
import com.bank.model.Account;
import com.bank.model.Customer;

public class BankDAOImpl implements BankDAO {
	private static Logger log = Logger.getLogger(BankDAOImpl.class);

	@Override
	public Customer registerAccount(Customer customer) throws BankException {
		try (Connection connection = PostgresConnection.getConnection()) {
			String sql1=("insert into bank_schema.logindetails(userid,password) values(?,?)");
			String sql = ("insert into bank_schema.customer(firstname,lastname,emailid,mobilenumber,userid) values(?,?,?,?,?)");
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getFirstName());
			preparedStatement.setString(2, customer.getLastName());
			preparedStatement.setString(3, customer.getEmailId());
			preparedStatement.setString(4, customer.getMobileNumber());
			preparedStatement1.setString(1, customer.getUserId());
			preparedStatement.setString(5, customer.getUserId());
			preparedStatement1.setString(2, customer.getPassword());
			int c1 = preparedStatement1.executeUpdate();
			int c = preparedStatement.executeUpdate();
			
			if (c == 1 && c1 == 1) {
				log.info("Registration Successful");
			}
				
		} catch (ClassNotFoundException | SQLException e) {
			log.warn(e);
			throw new BankException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		return customer;
	}

	@Override
	public Account createAccount(Account account) throws BankException {
		try (Connection connection = PostgresConnection.getConnection()) {
			String sql="insert into bank_schema.accountdetails(accountnumber,balance,pancard,userid,name) values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, account.getAccountNumber());
			preparedStatement.setDouble(2, account.getOpeningBalance());
			preparedStatement.setString(3, account.getPanCard());
			preparedStatement.setString(4, account.getUserId1());
			preparedStatement.setString(5, account.getName());
			int c = preparedStatement.executeUpdate();
			
			if (c == 1 ) {
				log.info("Account Opened Successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.warn(e);
			throw new BankException("Internal error occured... Kindly conatct SYSADMIN........");
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

	@Override
	public Customer getByAccountNumber(long accountNumber) throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getPasswordByUserId(String userId) throws BankException {
		Customer customer=new Customer();
		try (Connection connection = PostgresConnection.getConnection()) {
			String sql="select userid,password from bank_schema.logindetails where userid=?";
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if (resultSet.next() ) { 
				customer.setUserId(resultSet.getString("userId"));
				customer.setPassword(resultSet.getString("password"));
			}else {
				throw new BankException("Invalid UserId or Password ");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			log.warn(e);
			throw new BankException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		return customer;
	}

	@Override
	public double getBalanceByAccountNumber(long accountNumber) throws BankException {
		
		return 0;
	}

	@Override
	public String getPasswordByempId(String empId) throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

}
