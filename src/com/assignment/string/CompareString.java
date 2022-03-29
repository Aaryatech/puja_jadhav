package com.assignment.string;

public class CompareString {

	public static void main(String[] args) {
	
		String s1 = "Pooja";
		String s2 = "Pooja";
		
		String s3 = new String("Pooja");
		String s4 = new String("Pooja");
		
          /*if(s1.equals(s3)) {
        	  System.out.println("string is equal");
          }
          else {
        	  System.out.println("Not equal");
         */
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);///return false because equal operator refer the memory location and object
		System.out.println(s1.equals(s2));///return true it checks the value of object
		
		System.out.println(s3 == s4);  //return false
		
		
		
		///when you changes in string we can use stringBuffer class because string is mutable
		StringBuilder str = new StringBuilder("Pooja");///
		str.append("Jadhav");
		System.out.println(str);
		
	}

}
