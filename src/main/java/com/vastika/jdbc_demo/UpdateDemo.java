package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

public class UpdateDemo {

	public static final String SQL = "update starttable_tbl set user_name = 'awesome', password = '123' where id =2";


	public static void main(String[] args) {
		
		
		try(
				Connection con = DBUtil.getConnection();
				Statement st = con.createStatement();
				)
		{
			st.executeUpdate(SQL);
			System.out.println("data updated");
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}