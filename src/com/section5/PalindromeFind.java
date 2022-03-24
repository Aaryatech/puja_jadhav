package com.section5;

public class PalindromeFind {
	
	public static boolean isPalindrome(int number) {
		
		int temp = number;///hold the number value in temp
		int rem, rev = 0;
		while(number != 0) {
			rem = number % 10;///1...2...1..0
			rev = rev*10+rem;//1...12..121...121
			number = number / 10;///12...2..1..0
			
		}
		//System.out.println("palindrome no=" +rev);
		
		if(temp == rev) {
			return true;
		}
		else {
			
         return false;
		}
		
	
		
	}

	public static void main(String[] args) {
	
   System.out.println(isPalindrome(-1221));
	  
	
	}

}
