package com.section9.interfacee;

interface Printable{
	 void print();
	 
}
interface Showable{
	void print();
	
}
public class MultipleInheritance implements Printable,Showable {
	@Override
	public void print() {
		System.out.println("Hello");
	}


	public static void main(String[] args) {

		
		MultipleInheritance m1 = new MultipleInheritance();
		m1.print();
	}

	
	
	

}
