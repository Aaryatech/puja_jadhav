package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{///implment the comparable interface
	
	
	int id;
	String name;
	int age;
	
	public Student(int id,String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		
		return "id " + id +" name "+name +" age"  +age;
	}
	
	
	@Override
	public int compareTo(Student st) {///override the method of comaprable
		// TODO Auto-generated method stub
		return this.age - st.age;
	}
 
	////main method
	public static void main(String[] args) {
		
     ArrayList<Student> l1 = new ArrayList();
     l1.add(new Student(1,"Pooja",24));
     l1.add(new Student(2,"Rutuja",25));
     l1.add(new Student(3,"Ankita",23));
     
     System.out.println(l1);
     
     Collections.sort(l1);
     
     System.out.println(l1);
   
    for(Student st : l1) {
    	System.out.println(st.id +" "+st.name + " "+st.age);
    }
     
     

	}

	

}
