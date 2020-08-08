package com.vastika.jdbc_demo.util;

//In real time, we do not put queries all round. Instead there's 1 class like this QueryUtil where we put all the queries.
//We can bring all our previous queries here.

public class QueryUtil {
	/*
	public static final String INSERT_SQL = "insert into starttable_tbl(user_name, password)values('ram', 1234)";
	public static final String UPDATE_SQL = "update starttable_tbl set user_name = 'awesome', password = '123' where id =2";
	public static final String LIST_SQL = "select * from starttable_tbl";
	public static final String DELETE_SQL = "delete starttable_tbl where id =2";
	*/
	
	//from here, we're working on PS= prepared statement. Here, we do not send the direct values anymore.
	//Instead we place '?' in place of those values.
	
	public static final String INSERT_SQL = "insert into starttable_tbl(user_name, password)values(?, ?)";
	
	public static final String UPDATE_SQL = "update starttable_tbl set user_name = ?, password = ? where id =?";
	
	public static final String LIST_SQL = "select * from starttable_tbl";
	
	public static final String DELETE_SQL = "delete starttable_tbl where id = ?";
	
	//let's add 1 more query:
	public static final String GET_BY_ID_SQL = "select * from starttable_tbl where id = ?";
	
	
	
	

}
