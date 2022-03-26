package com.sectiom8.array;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		int[] array = new int[5];
     Scanner sc = new Scanner(System.in);
     
     
     int size;
     System.out.println("Entre the size of array");
     size = sc.nextInt();
     System.out.println("Enter array elment");
     
     for(int i = 0; i< size ;i++) {
    	 array[i] = sc.nextInt();
     }
     System.out.println("orignal array");
     for(int i = 0; i< size ;i++) {
    	System.out.println(array[i]);
     }
   
     int temp =0;
     
     for(int i =0;i<array.length;i++) {
    	 
    	 for(int j=i+1; j < array.length;j++) {
    		 
    		 if(array[i] > array[j]) {
    			 temp = array[i];
    			 array[i] = array[j];
    			 array[j] = temp;
    		 }
    	 }
    	 
     }
     System.out.println("ascending array");
     for(int i =0;i<size;i++) {
    	 System.out.println(array[i]);
     }


	}

}
