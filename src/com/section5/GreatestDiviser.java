package com.section5;

import java.io.ObjectInputStream.GetField;

public class GreatestDiviser {
	
	
	public void getGreatestCommonDiviser(int num1, int num2) {
		
		int i=1;
	
		int commonFactor=0;
		
	
		
		while(i!=num1 && i!=num2) {///
		
			if(num1%i==0 && num2%i==0) {////reminder 0 then print
				
				commonFactor = i;////strore in commonFactor
				
				System.out.println(commonFactor);
				
				
			}
			
		
			i++;
		
			
			}
		
		System.out.println("GreatestCommonFactor is 12 and 8 is="+commonFactor);
		
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   GreatestDiviser obj = new GreatestDiviser();
	   obj.getGreatestCommonDiviser(12, 30);
	

	}

}
