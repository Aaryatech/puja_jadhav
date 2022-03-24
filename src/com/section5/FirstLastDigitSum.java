package com.section5;

public class FirstLastDigitSum {
	
	
		public static int firstDigit(int number) {
			while(number >= 10) {///121
				number = number / 10;////12
				
			}
			return number;
			
		}
		public static int lastDigit(int number) {
			while(number >= 10) {
				number = number % 10;
			}
			return number;
			
		}
		
		public static int sumFistAndLastDigit(int number) {
			if(number < 0) {
				return -1;/////when no is minus get return -1
			}
			else {
			int add   =	firstDigit(number) + lastDigit(number);
			return add;
			
		}
		
		}
		
		public static void main(String[] args) {
	

		System.out.println(sumFistAndLastDigit(10));
	
		
       
  

	}

}
