package com.section5;

public class findIntrest {
	
	public static double  calculateIntrest(double amount,double intrestRate) {
		double intrest = amount *(intrestRate/100);
		return intrest;
		
	
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10,000 at 2% intrest = "+calculateIntrest(10000,2));
		System.out.println("10,000 at 3% intrest = "+calculateIntrest(10000,3));
		System.out.println("10,000 at 4% intrest = "+calculateIntrest(10000,3));
		System.out.println("10,000 at 4% intrest = "+calculateIntrest(10000,4));
		
		
		
		
		////USing for Loop
		for(int i=2; i<9; i++) {
			System.out.println("10000 at"+ i +"% intrest=" +calculateIntrest(10000,i));
			
		}
		

	}

}
