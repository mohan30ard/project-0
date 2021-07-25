package com.emp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.emp.dao.EmployeeDAO;
import com.emp.dbutil.PostgresConnection;
import com.emp.exception.BusinessException;
import com.emp.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public Employee createEmployee(Employee employee) throws BusinessException {
		try(Connection connection=PostgresConnection.getConnection()){
			String sql="insert into emp_schema.employee(empname,designation,city,gender) values(?,?,?,?) ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, employee.getEmpName());
			preparedStatement.setString(2, employee.getDesignation());
			preparedStatement.setString(3, employee.getCity());
			preparedStatement.setString(4, employee.getGender());
			int c=preparedStatement.executeUpdate();
			
			if(c==1)
			{
				ResultSet resultSet=preparedStatement.getGeneratedKeys();
				if(resultSet.next())
				{
					employee.setEmpId(resultSet.getInt(1));
				}
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int empId) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByCity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByDesignation(String designation) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
