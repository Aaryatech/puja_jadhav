package com.section6.opp.part1;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
    String empty ="String is empty";
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
    public String getFirstName() {
    	return firstName;
    	
    }
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    public String getSecondName() {
    	return lastName;
    	
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    public int getAge() {
    	return age;
    }
    
    public boolean isTeen() {
    	if(this.age >12 && this.age < 20){////compare age 
    	return true;
    	}else {
		return false;
    	}
    }
    public String getFullName() {
       	if(this.firstName.isEmpty() && this.lastName.isEmpty()) {
    		return empty;////is both fist and last name is empty then return empty string
    	}
       	else if(this.lastName.isEmpty()) {
    		return firstName;///if last name empty print first name
    	}
    	
    	return this.firstName + " "+this.lastName;
    	
    }
    
    
}
