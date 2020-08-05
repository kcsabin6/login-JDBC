package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DatabaseUtility;

@WebServlet("/DeleteDatabase")
public class DeleteDatabase extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	    	
    	String tobedeleted= request.getParameter("tobedeleted");
    	DatabaseUtility.delete(tobedeleted);
    	request.getRequestDispatcher("registration.jsp").forward(request, response);
    	
    	
    	
    	
    }
}
