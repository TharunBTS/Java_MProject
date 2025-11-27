package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	
	private static Connection connection = null;
	
	public static Connection getConnection() throws Exception
	{
		if( connection == null)
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/propertyTax","root","root@39");
		}
		return connection;
	}

}
