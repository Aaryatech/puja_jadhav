package com.collection;

import java.util.ArrayList;

public class Employee {

	int empId;
	String name;
	int salary;
	
	     Employee(int empId, String name, int salary){
	    	 this.empId = empId;
	    	 this.name = name;
	    	 this.salary = salary;
	    	 
	     }
	     public int getEmpId() {
	 		return empId;
	 	}

	 	public String getName() {
	 		return name;
	 	}

	 	public int getSalary() {
	 		return salary;
	 	}

	     
	     
	    /* public String toString() {
	    	 return empId +name +salary;
	     }*/
	     
	     
	public static void main(String[] args) {
		
		///Employee e1 = new Employee(101, "Pooja", 25000);
		//System.out.println(e1);
		
		ArrayList<Employee> l1= new ArrayList();
		Employee e1 = new Employee(101, "Pooja", 25000);
		Employee e2 = new Employee(102, "Rutuja", 25000);
		Employee e3 = new Employee(103, "Shital", 20000);


		l1.add( e1);
		l1.add(e2);
		l1.add(e3);
		
		
		for(Employee e : l1) {
			System.out.println(e.getEmpId() +" "+e.getName() +" "+e.getSalary());
		}
		

	}

	
}
