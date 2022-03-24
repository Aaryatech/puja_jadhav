package com.section5;

public class OddNumber {

	
	
	public static boolean isOdd(int number) {
	return number%2 !=0;
	
	}
	//find odd number sum
	public static int sumOdd(int start,int end) {
		int sum=0;
		for(int i=start; i<=end; i++) {
			if(i%2 != 0) {
				sum+=i;
				System.out.println(i);
			}
	       else if(start == end) {
	    	   return 0;
				
			}
			else if(start<0 || end<0) {
				return -1;
			}
		
		}
		System.out.println("Odd Number="+sum);
		
		
		return sum;
	}
	public static void main(String[] args) {

     System.out.println(isOdd(4));
     
     sumOdd(100,100);
     
     
		
		

	}

}
