package com.section5;
///program find sumevenDigit imput number =12345....then 2+4...sum is =6
public class sumEvenDigit {
	
	public static int getSumEvenNumber(int number) {///123456
		int sum = 0;
		if(number < 0) {
			return -1;
		}
			
		
		while(number > 0) {
			int num = number % 10;//////find number reminder
	
			if(num%2 == 0) {///////then compare reminder is even or not
				System.out.println(num);
				sum = sum + num;/////addition of even number
			}
			
			number = number / 10;
			}
		///loop end
		System.out.println("Sum of Even Number="+sum);
		return number;
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSumEvenNumber(123456789);
		System.out.println(getSumEvenNumber(-2));
		
		
		
	}

}
