package com.io.operation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterExample {

	public static void main(String[] args) {
	
     try {
		FileWriter fw = new FileWriter("demo.txt");
		
		String str = "Welcome";
		fw.write(str);
		fw.flush();
		fw.close();
		System.out.println("success");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     try {
		FileReader fr = new  FileReader("demo.txt");
		int i;
		while((i = fr.read())!= -1) {
			System.out.println((char)i);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     

	}

}
