package com.barclays.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public DatabaseConnection(String DatabaseLocation, String username, String password) {
		this.userName = username;
		this.password = password;
		this.DatabaseLocation = DatabaseLocation;
	}

	static String userName, password;
	static Connection con;
	static Statement stmt;
	static String DatabaseLocation;

	public void CreateConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://" + DatabaseLocation, userName, password);
			// here sonoo is database name, root is username and password
			stmt = con.createStatement();
			System.out.println("Connection created successfully");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String GetSQLResult(String query) throws SQLException {
		String result = "";
		ResultSet r = stmt.executeQuery(query);
		while (r.next()) {
			// Get String using column name
			result = r.getString("firstname");
		}
		return result;
	}

	public static void closeConnection() throws SQLException {
		con.close();
	}
}
