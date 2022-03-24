package com.section5;

public class EvenDigitSum {
	
	public static void getEvenDigitSum(int number) {
		int sum=0;
		int i;
		for( i=1; i<=number; i++) {
			if(i%2 == 0) {///find even number then print
			System.out.println(i);
			sum = sum +i;////find the sum of even number
			}
			
			
		}
		System.out.println("Sum Even Number="+sum);
	
		
	}

	public static void main(String[] args) {
	
       
      getEvenDigitSum(5);
       
	}

}
