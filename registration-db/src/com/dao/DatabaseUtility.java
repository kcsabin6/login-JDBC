package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtility {
	static Connection conn=null;
	
	static Connection getConnection(){
		try {
            Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "pelehuku");
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;

}
	
	public static void insert(String username,String password){
		conn=getConnection();
		try {
		PreparedStatement ps=conn.prepareStatement("insert into userdetails values(?,? )");
        
        ps.setString(1,username);
        ps.setString(2,password);
        
        int i=ps.executeUpdate();
        if(i>0){
            System.out.println("successfully inserted");
        }
		}
        catch(SQLException e) {
        	e.printStackTrace();
        }
            
            
	}
	
	
	public static void delete(String username) {
		conn=getConnection();
		try {
		PreparedStatement ps=conn.prepareStatement("delete from userdetails where uname=? ");
        
        ps.setString(1,username);
        
        int i=ps.executeUpdate();
        if(i>0){
            System.out.println("successfully deleted");
        }
		}
        catch(SQLException e) {
        	e.printStackTrace();
        }
		}
	


	public static void select(String username){
		conn=getConnection();
		try {
		PreparedStatement ps=conn.prepareStatement("select * from userdetails where uname=?");
        
        ps.setString(1,username);
        
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println("successfully searched : ");
            System.out.println(rs.getString("uname")+" "+rs.getString("pass"));
        }
		}
        catch(SQLException e) {
        	e.printStackTrace();
        }
            
            
	}
	
	
	
	
	
	
	
	

}
	

