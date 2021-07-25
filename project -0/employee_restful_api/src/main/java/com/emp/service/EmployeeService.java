package com.emp.service;

import java.util.List;

import com.emp.exception.BusinessException;
import com.emp.model.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee) throws BusinessException;
	public Employee getEmployeeById(int empId);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(int empId);
	
	public List<Employee> getAllEmployees();
	public List<Employee> getEmployeesByName(String name);
	public List<Employee> getEmployeesByAge(int age);
	public List<Employee> getEmployeesByCity(String city);
	public List<Employee> getEmployeesByGender(String gender);
	public List<Employee> getEmployeesByDesignation(String designation);
}
