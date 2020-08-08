package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCreateDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		String sql = "create database jdbc_demo_db";
		
		//In real time scenario, this is not recommended. We create them as constants and use them as shown in next TableCreateDemo.
		
		try {
			//1) register the driver:
			//however, from java 4.0 onwards, this is not reqd. the driver classs is automatically registered.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2) get connection object:
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=UTC","root","root1234");

			//3) get statement object:	
			st = con.createStatement();
			
			//4) execute query:
			st.executeUpdate(sql);
			System.out.println("Database created!!");
			
			} 
		
			catch (ClassNotFoundException|SQLException e) {
				
				e.printStackTrace();
			}
			finally {
				//classes that directly/indirectly extend/implement Auto-closeable classes are called resource classes.
				//such resource classes need to be closed explicitly in the finally block. 
				
				try {
					//5) close the connection and statement:
					con.close();
					st.close();
				} 
				catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			
			
			
			
			
			
		
		
		
		
		
	}

}
