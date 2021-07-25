package com.emp.model;

public class Employee {
	
	private int empId;
	private String empName;
	private String designation;
	private String city;
	private String gender;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(String empName, String designation, String city, String gender) {
		super();
		this.empName = empName;
		this.designation = designation;
		this.city = city;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", city=" + city
				+ ", gender=" + gender + "]";
	}
	
	

}
