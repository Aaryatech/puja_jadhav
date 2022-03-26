package com.section6.opp.part1;
/////Static Example
public class Student {
	
	int rollno;
	String name;
	static String college = "GPN";
	
	Student(int rollno, String name){
		this.name = name;
		this.rollno = rollno;
	
	}
	void display() {
		System.out.println(rollno+" "+name);
	}
	
	public static void main(String args[]) {
      
		
		Student s1 = new Student(1,"pooja");
		Student s2 = new Student(1,"Ankita");
		s1.display();
		s2.display();
		
	}

}


	

