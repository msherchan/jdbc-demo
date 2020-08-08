package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

public class InsertDemo {
	
	public static final String SQL = "insert into starttable_tbl(user_name, password)values('ram', 1234)";


	public static void main(String[] args) {
		
		
		try(
				Connection con = DBUtil.getConnection();
				Statement st = con.createStatement();
				)
		{
			st.executeUpdate(SQL);
			System.out.println("data inserted");
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
