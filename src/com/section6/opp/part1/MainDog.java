package com.section6.opp.part1;

   class Dog{
	   static String name;
	   
	   public Dog(String name) {
		   Dog.name =  name;
	   }
	   public void printName() {
		   System.out.println("Name = "+name);
	   }
   }

public class MainDog {

	public static void main(String[] args) {
		Dog rex = new Dog("rex");
		//rex.printName();
		
		Dog fluffy = new Dog("fluffy");
		rex.printName();
		fluffy.printName();

	}

}
