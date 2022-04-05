package com.io.operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args){
	////write data in file
		try {
			FileOutputStream fout = new FileOutputStream("pooja.txt");
			
			fout.write(65);
			
			fout.close();
			System.out.println("Success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		///read the data from file
		try {
			FileInputStream fin = new FileInputStream("pooja.txt");
			
			int i = fin.read();
			
			System.out.println((char)i);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
			

	}

}
