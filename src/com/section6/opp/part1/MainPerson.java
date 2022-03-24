package com.section6.opp.part1;

public class MainPerson {

	public static void main(String[] args) {
	Person obj = new Person();
	obj.setFirstName("Pooja");
    obj.setLastName("Jadhav");
    obj.setAge(10);
    
    System.out.println("FullName is = "+obj.getFullName());
    System.out.println(obj.isTeen());
    
    obj.setFirstName("");
    obj.setLastName("");
    System.out.println(obj.getFullName());
	
    
    obj.setFirstName("Pooja");
    obj.setLastName("");
    System.out.println("Full name is ="+obj.getFullName());
	

	}

}
