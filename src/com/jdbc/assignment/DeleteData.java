package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

	/////////delet particular record
	public String  delelteQuery = "delete from User where id = 105;";
	
	public void delteRecord() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","");
			Statement st = con.createStatement();
			
		int i = st.executeUpdate(delelteQuery);
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
	
      DeleteData obj = new DeleteData();
      
      obj.delteRecord();
	}

}
