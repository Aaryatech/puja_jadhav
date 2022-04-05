package com.io.operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {

   try {
	   ////write the string format data into file
	FileOutputStream fout = new FileOutputStream("pooja.txt");///
	   String str = "Byte Alephant Technologies";
	   
	   byte b[] = str.getBytes();////string convert into byte
	   
	   /*for(byte i =0; i<b.length ; i++) {
		   System.out.println((char)b[i]);////show ouput on console window
	   }*/
	   
	   fout.write(b);//////////write the data into file
	   fout.flush();
	   fout.close();
	    System.out.println("sucess");
	
      } catch (Exception e) {

	e.printStackTrace();
	}
   
   try {
	FileInputStream fin = new FileInputStream("pooja.txt");
	int i = 0;
	
	while((i = fin.read())!= -1) {
		System.out.print((char)i);
		
	}
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   


}
}