package jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
//import com.mysql.jdbc.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Selectdemo {

	static String dbURL = "jdbc:mysql://localhost:3306/sampledb";
	static String username = "root";
	static String password = "pelehuku";
	static Connection conn = null;

	public static void main(String[] args) {
		try {
            Class.forName("com.mysql.jdbc.Driver");
			 conn = DriverManager.getConnection(dbURL, username, password);//if we write here Connection conn then itwill be a local variable
			if (conn != null) {
				System.out.println("Connected");
				PreparedStatement ps=conn.prepareStatement("select * from tbl_sample  where id=?" );
				ps.setInt(1, 4);
				ResultSet rs=ps.executeQuery();
				 while(rs.next()){	     
				        
				     System.out.println(rs.getString("id") + "   " + rs.getString("name") );
					// System.out.println(rs.getString(1) + "   " + rs.getString(2)  );
					
				      }
								
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				conn.close();
				
			} catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("problem in closing connection");
			}

		}
	}

}
