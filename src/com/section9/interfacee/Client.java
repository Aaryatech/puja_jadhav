package com.section9.interfacee;

import java.util.Scanner;

public interface Client {
	
	void input();
	void output();/////by default method is abstrat...
	
	public default void display() {
		System.out.println("Default method is called");
	}

}
class Devloper implements Client{
	Scanner sc = new Scanner(System.in);
	String name;
	int salary;
	@Override
	public void input() {////overideb the method og interface class
		
		System.out.println("Enter the name");
		name = sc.nextLine();
		
		System.out.println("Enter the salary");
		salary = sc.nextInt();
		}

	@Override
	public void output() {
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}
	
}