package com.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bank.model.Account;

/**
 * Servlet implementation class AccountS
 */
public class AccountS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if(session == null)
		{
			out.print("<center><h1>Please Login First</h1></center>");
			out.print("<h4><a href='/bank_thor_v2'>Click here to Login </a> ");
		}else {
			out.print("<center><h2>Your Account Number is:"+session.getAttribute("accountNumber")+"</h2></center>");
			//out.print("<center><h2>Your Account Number is:"+a+"</h2></center>");
			out.print("<p><a href='/bank_thor_v2/index.html'>Click Here to go to MainMenu</a></p>");
			
		}
	}

}
