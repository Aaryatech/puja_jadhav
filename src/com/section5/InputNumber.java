package com.section5;

import java.util.Scanner;

public class InputNumber {
	
	public static void getSumOfNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		 
		int sum=0;
		for(int i = 1; i<=num; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("Sum is="+sum);
	}
	public static void main(String[] args) {
		
		getSumOfNumber();
		
		/*Scanner sc = new Scanner(System.in);
		
		int counter = 0;
		int sum = 0;
		
		while(true) {
			int order = counter + 1;
			System.out.println("Enter number "+order +":");
			 boolean  isAnInt = sc.hasNextInt();
			 
			 if(isAnInt) {
				 int number = sc.nextInt();
				 counter++;
				 sum = sum + number;
				 if(counter == 10) {
					 break;
				 }
			 }else {
				 System.out.println("Invalid number");
			 }
					 
					 
		}
    System.out.println("sum="+sum);*/
	}


}
