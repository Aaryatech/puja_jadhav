package com.collection;

import java.util.ArrayList;

public class Student {
	
	
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

	public static void main(String[] args) {
		
     ArrayList<Student> l1 = new ArrayList();
     l1.add(new Student(1,"Pooja",24));
     l1.add(new Student(2,"Rutuja",25));
     l1.add(new Student(3,"Ankita",23));
     
     System.out.println(l1);
     
     
     

	}

}
