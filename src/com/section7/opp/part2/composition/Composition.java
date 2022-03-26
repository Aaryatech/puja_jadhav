package com.section7.opp.part2.composition;

public class Composition {

	  private String name;
	  private Abb birthday;
	  
	 Composition(String name, Abb birthday){
		this.name = name;
		this.birthday = birthday;
		
	}
	 
	public void display() {
		System.out.println("Name ="+name );
		
		//return "Name"+name +"Birthday" + birthday;
	}
}
