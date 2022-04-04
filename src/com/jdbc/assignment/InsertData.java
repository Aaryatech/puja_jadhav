package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	///////////////////insert data n dababse
	private String insertData = "insert into User "+"values(101,'pooja','pooja@gmail.com','Nashik'),"
	                        +"(102,'Ankita','Ankita@gmail.com','Nashik'),"
			                +"(103,'Akshada','Akshada@gmail.com','Nashik'),"
	                        +"(104,'Rutuja','Rutuja@gmail.com','Kopargaon'),"
			                +"(105,'Kastuti','kasturi@gmail.com','Mumbai');";
	
	/////////update perticular record
	private String updateData = " update User set country = 'pune' where id = 102;";
	
	/////delete the purticular record

	
	
	public void InsertQuery() {
		try {
			Class.forName("com.mysql.jdbc.Driver");////load driver
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","");///create connection statment
			
			Statement st = con.createStatement();
		      int i =	st.executeUpdate(insertData);
		
		st.executeUpdate(updateData);
	    System.out.println("no of records = "+i);
            con.close();
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
		
		InsertData obj = new InsertData();////create a  abject of class
		obj.InsertQuery();

	}

}
