package com.javaArrays;

import java.sql.*;



public class JdbcConnection {
	public static void main(String[] args) {
		String sql=" select  name from product where Id=1";
		String username="Ramanareddy";
		String password="0000";
		
		String url = null;
		try {
			Connection con=DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			rs.next();
			String name=rs.getString(1);
			System.out.println(name);
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
