package com.dog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DogMain {
	public static void main(String[] args) {
		//JDBC programming
		
		try {
			//step 1 loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","pelehuku");
			if(conn!=null) {
				System.out.println("I have connected to database");
			}
			String sql="insert into dog_tbl(did,name,color,age)values(?,?,?,?)";
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter dog id");
			int did = scanner.nextInt();
			
			System.out.println("Enter dog name");
			String name = scanner.next();
			
			System.out.println("Enter dog color");
			String color = scanner.next();
			
			System.out.println("Enter dog age");
			int age = scanner.nextInt();
			
			//compile query and prepare the instances of PreparedStatement
			PreparedStatement ps=conn.prepareStatement(sql);
			/*ps.setInt(1,900);
			ps.setString(2,"Tommy");
			ps.setString(3, "white");
			ps.setInt(4,2);*/
			
			ps.setInt(1,did);
			ps.setString(2,name);
			ps.setString(3,color);
			ps.setInt(4,age);
			
			ps.execute();
			System.out.println("data is saved");
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}

}
