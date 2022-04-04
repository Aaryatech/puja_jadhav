package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	 
	  private String createTable = "create table User(\n"+"id int(3),"+"name varchar(20),\n"+"email varchar(20),\n"+" country varchar(20)\n"+");";
	
	  
	 
	
	public void CreateQuery() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","");
			Statement st = con.createStatement();
			st.execute(createTable);
			
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
		     
        CreateTable obj = new CreateTable();	
        obj.CreateQuery();

	}

}
