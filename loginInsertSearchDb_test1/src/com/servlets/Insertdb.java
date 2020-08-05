package com.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DatabaseUtility;

@WebServlet("/Insertdb")
public class Insertdb extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
      //  System.out.println("Converted String: " + strDate);  
    	    	
    	String name= request.getParameter("username");
    	String password= request.getParameter("password");
    	String email= request.getParameter("email");
    	//String fname= request.getParameter("name");
    	
    	
    	
    	
    	DatabaseUtility.insert(name,password,email,strDate);
    	request.getRequestDispatcher("signin.jsp").forward(request, response);
    	 	
    	
    	
    }
}
