package com.section7.encapusulation;

//////Encapsulation example	
class Employee{
	
	// int empId = 10;////when we  declare the variable public we can change the data member in other class
	 
	private int empId ;///declare the variable is private we can achieve the data hiding concept

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
}

public class Company {

	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		//e1.empId = 100;
		//System.out.println(e1.empId);
		e1.setEmpId(101);////change the modify in code we can use setter and getter methd
		System.out.println("Employee Id is = "+e1.getEmpId());
        
		
		
		e1.setEmpId(102);
		System.out.println(e1.getEmpId());
	}

}
