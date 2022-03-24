package com.section5;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		
		System.out.println("Enter your BirthYear");
		int yearOfBirth = sc.nextInt();
		
		int age = 2022 - yearOfBirth;
		
		
		 
		 System.out.println("Your Name is "+name +"you are "+age+" old");
		 
		 
		
	}

}
