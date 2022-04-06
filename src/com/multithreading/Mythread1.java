package com.multithreading;

public class Mythread1 {

	public static void main(String[] args) {


	Thread t1 = new Thread("My thread");
	
	t1.start();///thread is an active state
	
	String str = t1.getName();///getting thread name by invoking the getName() name
	System.out.println("Threa name is "+str);
	
	

	}

}
