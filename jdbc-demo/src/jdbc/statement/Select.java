package jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
//import com.mysql.jdbc.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	static String dbURL = "jdbc:mysql://localhost:3306/sampledb";
	static String username = "root";
	static String password = "pelehuku";
	static Connection conn = null;

	public static void main(String[] args) {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection(dbURL, username, password);//if we write here Connection conn then itwill be a local variable
			if (conn != null) {
				System.out.println("Connected");
				 Statement st=conn.createStatement();//note --no parameter
					String sql="select *from tbl_sample where id=3";
					
					ResultSet rs=st.executeQuery(sql);
				 while(rs.next()){	     
				        
				     System.out.println(rs.getInt("id") + "   " + rs.getString("name") );
					 System.out.println(rs.getString(1) + "   " + rs.getString(3)  );
					
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
