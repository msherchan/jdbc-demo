package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

public class TableCreateDemo {

	//create constants for all:
	//public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver"; from JAVA 6, not needed.
	//need to mention the database name here in this URL after the local host because that's where the table will be created.
	//in the DBCreateDemo class, we were creating a new database so no database_name was mentioned after the localhost there.
	
	public static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo_db?serverTimezone=UTC";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root1234";
	public static final String SQL = "create table starttable_tbl(id int not null auto_increment, user_name varchar(45), password varchar(50), primary key(id))";
	
	
	//from JAVA 7, we do not need the finally block. The connection and statement are inside the try block so no need to close them.
	//also, driver_name above can be commented out.
	
	public static void main(String[] args) {
		
		try (
			//this is called try with resource. came since Java 7.
			//because of this, we do not need the finally block anymore.
			
			//Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			//now that we have created a DBUtil class and a getConnection method over there, we can use it here as:
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			
				){
			st.executeUpdate(SQL);
			System.out.println("table created");
		}
			
			
		
		
		
		catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
