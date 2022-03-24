package com.section5;

///find largest prime factor
public class LargestPrime {
	
	public static int getLargestPrime(int number) {
		if(number <= 0) {
			return -1;
			
			}
		
		int i=2;////0 and 1 not containg prime number
		int factor=0;/////strore the factor in local variable
		while(i!= number) {
			if(number%i ==0) {
				factor = i;
				
			}
			i++;
			
		}
		
		return factor;
	}

	public static void main(String[] args) {

     System.out.println("Largest Prime factor="+getLargestPrime(217));

	}

}
