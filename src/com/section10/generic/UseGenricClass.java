package com.section10.generic;

public class UseGenricClass {

	public static void main(String[] args) {
     GenericClass<Integer> obj = new GenericClass<Integer>();
     obj.add(2);
  
    System.out.println(obj.get());
	}

}
