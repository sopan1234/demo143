package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StartEx {
	public static void main(String[] args) throws Exception {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc::Mysql://localhost:3360/test","root","root");
		Statement stmt=con.createStatement();
		String sql="Select * From Student";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			String sid=rs.getString(1);
			System.out.println(sid);
			String sname=rs.getString(2);
			System.out.println(sname);
		}
		
		System.out.println(2);
		System.out.println(3);
	}

}
