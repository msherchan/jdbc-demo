package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtil;
import com.vastika.jdbc_demo.util.QueryUtil;

public class SelectDemops {

	public static void main(String[] args) {
		
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.LIST_SQL);)
				
				{
				//because ino ur list_sql query, we do not have any values, we are simply getting all the info from the list, we do not need to set these values below:
				/*
				ps.setString(1, "Shyam Dhakal");
				ps.setString(2, "bb");
				ps.setInt(3, 4);
				*/
				
				//since we pass the query above in the ps, we do not need to do it here anymore (pass the argument).
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					
					System.out.println("username is: " + rs.getString("user_name"));
					System.out.println("id is: " + rs.getInt("id"));
					System.out.println("password is: " + rs.getString("password"));
				}
				
				
				}
				
				catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
			

		}

	}


