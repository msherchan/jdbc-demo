package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtil;
import com.vastika.jdbc_demo.util.QueryUtil;

public class DeleteDemops {

public static void main(String[] args) {
		
		try (
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(QueryUtil.DELETE_SQL);)
			
			{
			//because we have '?' set only for the 'id',  now we need to set a value for 'id' only here:
			
			ps.setInt(1, 4);
			ps.executeUpdate();
			System.out.println("data deleted");
			
			}
			
			catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		

	}

}


