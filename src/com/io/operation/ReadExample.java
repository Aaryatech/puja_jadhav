package com.io.operation;

import java.io.ByteArrayInputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		
		byte[] buf = {35,36,37,38};
		///read the byte array data
		ByteArrayInputStream byt = new  ByteArrayInputStream(buf);
		
		int k =0;
		
		while((k = byt.read()) != -1) {////read method 
			
			System.out.println(k);
		}
		
		

	}

}
