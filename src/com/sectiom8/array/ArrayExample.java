package com.sectiom8.array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] myArray = new int[10];
		
		for(int i = 0;i<myArray.length;i++) {
			myArray[i] = i;
			System.out.println(myArray[i]);
		}
		int[] a1 = {2,4,6,8,10};
		//System.out.println(a1[1]);
		//myArray[1] = 50;
		//System.out.println(myArray[1]);
		for(int i = 0; i<a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		
		/// using Scanner
		Scanner sc = new Scanner(System.in);
		int[]  arr1 = new int[10];
		System.out.println("Enter the Array element");
		    
		for(int i = 0; i<arr1.length ;i++) {
			arr1[i] = sc.nextInt();
		}
		
		for(int i = 0;i<arr1.length ; i++) {
			System.out.println(arr1[i]);
		}

	}

}
