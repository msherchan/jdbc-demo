package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

//this is select * from tbl; procedure of mySql:

public class SelectDemo {

	public static final String SQL = "select * from starttable_tbl";
	
	public static void main(String[] args) {
		
		try(
				Connection con = DBUtil.getConnection();
				Statement st = con.createStatement();
				)
		{
			ResultSet rs = st.executeQuery(SQL);
			
			while(rs.next()) {
				
				//this below is based on column name/label:
				System.out.println("id is: " + rs.getInt("id"));
				System.out.println("user name is: " + rs.getString("user_name") );
				System.out.println("password is: " + rs.getString("password"));
				System.out.println("=========");
				
				//this below is based on column index:
				System.out.println("id is: " + rs.getInt(1));
				System.out.println("user name is: " + rs.getString(2) );
				System.out.println("password is: " + rs.getString(3));
				System.out.println("=========");
			}
			
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}