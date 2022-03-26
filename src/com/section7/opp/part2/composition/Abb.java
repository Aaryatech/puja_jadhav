package com.section7.opp.part2.composition;

public class Abb {
    
	int day;
	int month;
	int year;
	
	public Abb(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void getBirthday() {
		System.out.println(day+" "+month+" "+year);
		
	}
}
