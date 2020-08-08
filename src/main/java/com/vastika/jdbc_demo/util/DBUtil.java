package com.vastika.jdbc_demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//PS demo.
// this util packagae and this class is similar to what we did earlier in DBCreateDemo class.

public class DBUtil {

		//create constants for all:
		public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
		public static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo_db?serverTimezone=UTC";
		public static final String USER_NAME = "root";
		public static final String PASSWORD = "root1234";
	
		
		public static Connection getConnection() throws SQLException, ClassNotFoundException {
			
			//Step 1: Register the driver:
			Class.forName(DRIVER_NAME);
			
			//Step 2: this return statement here is our step 2 from the previous DBCreateDemo.
			//i.e.: get Connection object:
			return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
			/* this line above is the same as that we had done earlier while creating a database in DBCreateDemo class.
			 * 		Connection con = null;
			 * 		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=UTC","root","root1234");
			 * 
			 */

			
		}

}
