package com.sectiom8.array;

import java.util.Scanner;

public class Array {
	Scanner sc = new Scanner(System.in);

	public  int[] getInteger(int number) {
		System.out.println("Enter"+number +"integer values");
		int[] values = new int[number];
		for (int i = 0;i<values.length;i++) {
			values[i] = sc.nextInt();
			
		}
		return values;
	}
	
	

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a1 = new Array();
		int[] myValue = a1.getInteger(5);
		double sum = 0;
		double Avg=0;
		for(int i = 0;i<myValue.length ; i++) {
			System.out.println("Value is "+myValue[i]);
			sum = sum + myValue[i];
			Avg = sum/myValue.length;
		}
		System.out.println("Sum is="+sum);
        System.out.println("Average is="+Avg);
        

	}

}
