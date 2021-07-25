package com.emp.dao;

import java.util.List;

import com.emp.exception.BusinessException;
import com.emp.model.Employee;

public interface EmployeeDAO {

	public Employee createEmployee(Employee employee) throws BusinessException;
	public Employee getEmployeeById(int empId) throws BusinessException;
	public Employee updateEmployee(Employee employee) throws BusinessException;
	public void deleteEmployee(int empId) throws BusinessException;
	
	public List<Employee> getAllEmployees() throws BusinessException;
	public List<Employee> getEmployeesByName(String name) throws BusinessException;
	public List<Employee> getEmployeesByAge(int age) throws BusinessException;
	public List<Employee> getEmployeesByCity(String city) throws BusinessException;
	public List<Employee> getEmployeesByGender(String gender) throws BusinessException;
	public List<Employee> getEmployeesByDesignation(String designation) throws BusinessException;
	
}
