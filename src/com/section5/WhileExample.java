package com.section5;

public class WhileExample {

	public static void main(String[] args) {
     /* int count = 1;
      while(count !=6) {
    	  System.out.println(count);
    	  ++count;
      }*/
		
		int count = 1;
		while(true) {
			if(count == 6) {
				break;
			}
			System.out.println("count value is = "+count);
			count++;
		}
		
		//// do while
		int a = 1;
		do {
			System.out.println("A value is "+a);
			a++;
		}while(a < 6);
		
		
		///breakl
		for(int i = 1; i<=10; i++) {
			if(i ==5) {
				break;
			}
			System.out.println(i);
		}
		
		

	}

}
