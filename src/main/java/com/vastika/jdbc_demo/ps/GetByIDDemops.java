package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtil;
import com.vastika.jdbc_demo.util.QueryUtil;

public class GetByIDDemops {

public static void main(String[] args) {
		
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.GET_BY_ID_SQL);)
				
				{
				//because in our get_by_id_sql query, we have 1 '?' for id, so here we do need to set the value for that below:
				//the rest username and password do not need to be set.
				/*
				ps.setString(1, "Shyam Dhakal");
				ps.setString(2, "bb");
				*/
			
				ps.setInt(3, 4);
				//since we pass the query above in the ps, we do not need to do it here anymore (pass the argument).
				ResultSet rs = ps.executeQuery();
				
				//for list of data, we write a while loop.
				//while getting an individual info of data, we use if statement:
				if(rs.next()) {
					
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




