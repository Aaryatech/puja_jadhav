package com.sectiom8.array;

import java.util.Scanner;

public class MininumNumber {
	Scanner sc = new Scanner(System.in);
	
	public int[] readInteger(int count) {
		
		int[] array = new int[count];
		for(int i = 0; i<array.length; i++) {
			System.out.println("Enter the number");
		int	number = sc.nextInt();
			array[i] = number;
		}
		return array;
	}
	
	////find minumum number
	int findMin(int array[]) {
		int min = Integer.MAX_VALUE;
		
		for(int i = 0;i<array.length; i++) {
			int value = array[i];
			
			if(value < min) {
				min = value;
			}
		}
		return min;
		
	}


	public static void main(String[] args) {
		
		MininumNumber n1 = new MininumNumber();
		Scanner sc = new Scanner(System.in);
		
	   System.out.println("Enter the count");
	   int count = sc.nextInt();
	   
	   int[] returnedArray = n1.readInteger(count);
	   int returnMin = n1.findMin(returnedArray);
	   System.out.println("Minimum Number is = "+returnMin);
	   

	}

}
