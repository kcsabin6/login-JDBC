package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DatabaseUtility;

@WebServlet("/SearchDatabase")
public class SearchDatabase extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	
    	String tobeviewed= request.getParameter("tobeviewed");
    	DatabaseUtility.select(tobeviewed);
    	request.getRequestDispatcher("view.jsp").forward(request, response);
    	
    	
    	
    }
}
