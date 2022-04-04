package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prepared {
	
	private String insertData = "insert into User values(?,?,?,?);";
	
	private String update = "update User set name =? where id = ?;";
	
	public void insertRecord() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","");
			///craete a prepareStatement object
			PreparedStatement stmt = con.prepareStatement(insertData);
			
			stmt.setInt(1, 106);
			
			stmt.setString(2,"kajal");
			
			stmt.setString(3, "kajal@gmail.com");
			
			stmt.setString(4, "Pune");
			
			stmt.executeUpdate();
			System.out.println("data inserted ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public void update() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","");
			
			PreparedStatement stmt = con.prepareStatement(update);
			
			stmt.setString(1,"Unnati");
			stmt.setInt(2, 106);
			int i =stmt.executeUpdate();
			System.out.println(i);
			
		
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
		
		Prepared obj = new Prepared();
		//obj.insertRecord();
		obj.update();

	}

}
