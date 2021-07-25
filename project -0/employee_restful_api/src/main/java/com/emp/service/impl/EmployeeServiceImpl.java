package com.emp.service.impl;

import java.util.List;

import com.emp.dao.EmployeeDAO;
import com.emp.dao.impl.EmployeeDAOImpl;
import com.emp.exception.BusinessException;
import com.emp.model.Employee;
import com.emp.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO employeeDAO=new EmployeeDAOImpl();
	@Override
	public Employee createEmployee(Employee employee) throws BusinessException {
		if(employee!=null )
		{
			employee=employeeDAO.createEmployee(employee);
		}else {
			throw new BusinessException("not created properly please try again");
		}
		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByDesignation(String designation) {
		// TODO Auto-generated method stub
		return null;
	}

}


