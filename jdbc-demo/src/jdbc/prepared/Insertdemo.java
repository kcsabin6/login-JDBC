package jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertdemo {
	static String dbURL = "jdbc:mysql://localhost:3306/sampledb"; 
	static String username = "root";
	static String password = "pelehuku";
	static Connection conn = null;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(dbURL, username, password);
			if(conn!=null) {
				System.out.println("connected");
				PreparedStatement ps = conn.prepareStatement("insert into tbl_sample values(?,?,? )");
				ps.setInt(1,10);
				ps.setString(2,"yan");
				ps.setInt(3,12);
				int i = ps.executeUpdate();
				if(i>0) {
					System.out.println("successfully inserted");
			}
			
			
			}	
		}
		catch(Exception ex) {
			ex.printStackTrace();
			//System.out.println("problem");
		}
		
		finally {
			
			try {
				conn.close();
			}
			catch(SQLException e) {
				//e.printStackTrace();
				System.out.println("problem in closing connection");
			}
			
			
		}
	}
	
	
	

}
