package com.servlets;

import com.dao.DatabaseUtility;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DatabaseUtility;

//import com.dao.DatabaseUtility;

@WebServlet("/Searchdb")
public class Searchdb extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		DatabaseUtility dbu1 = DatabaseUtility.select(username, password);
		
		request.setAttribute("magic", dbu1);//dbu1 is the return value of above method i.e. dbUtility
		//if(dbu1 != null) {request.getRequestDispatcher("result.jsp").forward(request, response);}
		//else{request.getRequestDispatcher("signin.jsp").forward(request, response);}

		request.getRequestDispatcher("result.jsp").forward(request, response);

	}
}
