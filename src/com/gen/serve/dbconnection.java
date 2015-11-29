package com.gen.serve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;


public class dbconnection {
	
	public static  Connection dbconnectionmethod() {

		Connection conn=null;
    String url="jdbc:mysql://localhost:3306/";
    String dbName="world";
    String driver="com.mysql.jdbc.Driver";
	try {
		Class.forName(driver).newInstance();
		
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		
		conn = DriverManager.getConnection(url+dbName, "root", "1415");
		System.out.println("connected");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
}
	
}



// Connection conn=dbconnection.dbconnectionmethod();
