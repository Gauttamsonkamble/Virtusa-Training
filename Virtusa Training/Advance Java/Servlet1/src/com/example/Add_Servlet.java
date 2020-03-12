package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add_Servlet
 */
@WebServlet("/Add_Servlet")
public class Add_Servlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException{
		String name=request.getParameter("mail");
		String pass=request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		
		out.println("Username="+name);
		out.println("<br> Password="+pass);
			}
	
	
	
	

}
