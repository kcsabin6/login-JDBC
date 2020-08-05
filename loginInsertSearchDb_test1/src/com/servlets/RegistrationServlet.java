package com.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DatabaseUtility;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "pelehuku");
             if(conn!=null){
                System.out.println("Connected");
              }
                PreparedStatement ps=conn.prepareStatement("insert into userdetails values(?,? )");
                
                ps.setString(1,request.getParameter("username"));
                ps.setString(2,request.getParameter("password"));
                
                int i=ps.executeUpdate();
                if(i>0){
                   // System.out.println("successfully inserted");
                	request.setAttribute("connected", "You are connected");
                	request.getRequestDispatcher("registration.jsp").forward(request, response);
            		
                       }    
                                
            
        } catch (Exception ex) {
            ex.printStackTrace();
               }
    	
    	/*String name= request.getParameter("username");
    	String password= request.getParameter("password");
    	
    	DatabaseUtility.insert(name,password);
    	request.getRequestDispatcher("registration.jsp").forward(request, response);*/
    	
    	
    	/*String tobedeleted= request.getParameter("tobedeleted");
    	DatabaseUtility.delete(tobedeleted);
    	request.getRequestDispatcher("registration.jsp").forward(request, response);*/
    	
    	/*String tobeviewed= request.getParameter("tobeviewed");
    	DatabaseUtility.select(tobeviewed);
    	request.getRequestDispatcher("view.jsp").forward(request, response);*/
    	
    	
    	
    }
}
