package com.section5;

public class SumDigit {
	
	public static int sumDigits(int number) {
		if(number < 10) {
			return -1;
			
		}
		int sum = 0;///return 5..7
		while (number > 0) {
			int digit = number % 10;  /////5..2..1
			sum += digit;///5...5+2=7..8
			number = number / 10;///12...
		}
		return sum;
	}

	public static void main(String[] args) {
	
		System.out.println("The  sum of the digits 125 ="+sumDigits(125));
		System.out.println("The  sum of the digits 1 ="+sumDigits(1));
		
		System.out.println("The  sum of the digits 150 ="+sumDigits(150));
		

	}

}
