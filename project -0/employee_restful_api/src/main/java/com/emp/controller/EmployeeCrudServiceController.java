package com.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.exception.BusinessException;
import com.emp.model.Employee;
import com.emp.service.EmployeeService;
import com.emp.service.impl.EmployeeServiceImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class EmployeeCrudServiceController
 */
public class EmployeeCrudServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeCrudServiceController() {
        super();
        // TODO Auto-generated constructor stub
    }
    private EmployeeService employeeService=new EmployeeServiceImpl();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson gson=new Gson();
		Employee employee=gson.fromJson(request.getReader(), Employee.class);
		try {
			employee=employeeService.createEmployee(employee);
			System.out.println(employee);
		} catch (BusinessException e) {
			System.out.println(e);
		}
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.print(gson.toJson(employee));
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
