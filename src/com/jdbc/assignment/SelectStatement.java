package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatement {
	
	private String selectQuery = "select * from User;";
	
	public void Select() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(selectQuery);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"   "+rs.getString(2));
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          SelectStatement obj = new SelectStatement();
          obj.Select();
	}

}
