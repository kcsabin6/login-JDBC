package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtility {
	private String usernamedb;
	private String passworddb;
	private String emaildb;
	private String fnamedb;

	public DatabaseUtility() {
		super();

	}

	public DatabaseUtility(String unamedb, String pswrddb, String emldb, String fnamdb) {
		super();
		this.usernamedb = unamedb;
		this.passworddb = pswrddb;
		this.emaildb = emldb;
		this.fnamedb = fnamdb;
	}

	public String getUsernamedb() {
		return usernamedb;
	}

	public void setUsernamedb(String usernamedb) {
		this.usernamedb = usernamedb;
	}

	public String getPassworddb() {
		return passworddb;
	}

	public void setPassworddb(String passworddb) {
		this.passworddb = passworddb;
	}

	public String getEmaildb() {
		return emaildb;
	}

	public void setEmaildb(String emaildb) {
		this.emaildb = emaildb;
	}

	public String getFnamedb() {
		return fnamedb;
	}

	public void setFnamedb(String fnamedb) {
		this.fnamedb = fnamedb;
	}

	static Connection conn = null;

	static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root", "pelehuku");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

	public static void insert(String username, String password, String role, String date) {
		conn = getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into login_tbl values(?,?,?,?)");

			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, role);
			ps.setString(4, date);

			int i = ps.executeUpdate();
			if (i > 0) {
				System.out.println("successfully inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void delete(String username) {
		conn = getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete from userdetails where uname=? ");

			ps.setString(1, username);

			int i = ps.executeUpdate();
			if (i > 0) {
				System.out.println("successfully deleted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static DatabaseUtility select(String username, String password) {
		conn = getConnection();
		DatabaseUtility dbUtility = new DatabaseUtility();

		try {
			PreparedStatement ps = conn.prepareStatement("select * from login_tbl where username=?");

			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("successfully searched : ");

				String usernamedb = rs.getString("username");
				String passworddb = rs.getString("password");
				String emaildb = rs.getString("role");
				String fnamedb = rs.getString("time");
				//dbUtility = new DatabaseUtility(usernamedb, passworddb, emaildb, fnamedb);

				if ((usernamedb != null) && (passworddb != null)) {
					if (passworddb.equals(password)) {
						System.out.println("Data matched ");
						dbUtility = new DatabaseUtility(usernamedb, passworddb, emaildb, fnamedb);
					}
					
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dbUtility;
	}

}
