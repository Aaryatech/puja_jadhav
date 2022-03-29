package com.assignment.staticmethod;

public class StaticExample {
	
	static int a = 10;////static variable
	int b = 20;
    void display() {
	   System.out.println(a);
   }
    static void show() {
    	System.out.println(a);
    	//System.out.println(b);///static method not acces the static variable
    }

	public static void main(String[] args) {
	StaticExample s1 = new StaticExample();
	s1.display();
		show();///we direct access the static method without object
	}

}
