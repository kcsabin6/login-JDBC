package com.servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DatabaseUtility;

@WebServlet("/InsertDatabase")
public class InsertDatabase extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	
    	String name= request.getParameter("username");
    	String password= request.getParameter("password");
    	
    	DatabaseUtility.insert(name,password);
    	request.getRequestDispatcher("registration.jsp").forward(request, response);
    	 	
    	
    	
    }
}
