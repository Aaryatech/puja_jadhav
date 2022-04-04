package com.section14.exception;

import java.util.Scanner;

class YoungerAgeException extends Exception{
	
	public YoungerAgeException(String msg) {	
		super(msg);
		
	}
	
}
public class CheckVoting {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);////
		
		System.out.println("Enter the age");
		
		int age = sc.nextInt();
		try {/////handle the excpetion with try and catch
		if(age < 18) {
			/////throw custom exception
				throw new YoungerAgeException("You are not eligible for vote");
				
	      }
		else {
			System.out.println("You are eligible");
		}
		}
		
		catch (YoungerAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		

	}

}
