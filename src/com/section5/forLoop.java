package com.section5;

public class forLoop {

	public static void main(String[] args) {
		/*for(int i=100;i<=200;i+=10) {
			System.out.println(i);
		}*/
		///only no divideb by 3 & 5
		int count = 0;
		int sum = 0;
				
		for(int i=1;i<=1000;i++) {
			if(i%3==0 && i%5==0) {
				count++;
				sum+=i;
				System.out.println("Found Number="+i);
			}
			if(count == 5) {
				break;
			}
		}
		System.out.println("Sum =" +sum);

	}

}
