package com.sectiom8.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		
		int array[] = new int[100];
		
		System.out.println("Enter the array element");
		for(int i = 0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are");
         for(int i=0 ;i<size; i++) {
        	 System.out.println(array[i]);
         }
         
         System.out.println("REverse Array");
         for(int i=size-1 ;i>0; i--) {
        	 System.out.println(array[i]);
         }
	}

}
