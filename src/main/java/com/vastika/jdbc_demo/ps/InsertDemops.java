package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtil;
import com.vastika.jdbc_demo.util.QueryUtil;

public class InsertDemops {

	public static void main(String[] args) {
		
		try (
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(QueryUtil.INSERT_SQL);)
			
			{
			//because we have set '?s' for the values, now we need to set those values here:
			ps.setString(1, "Ram Raja");
			ps.setString(2, "aa");
			
			//since we pass the query above in the ps, we do not need to do it here anymore (pass the argument).
			ps.executeUpdate();
			System.out.println("data inserted");
			
			}
			
			catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
