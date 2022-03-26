package com.section6.part1.inheritance;
/////find circle area and cylinder extends the circle class
public class Circle {
	
	 double radius;
	final double pi=3.14;
	
public	Circle(double radius){
		this.radius = radius;
	}
	public void setRadius(double radius) {
		if(radius < 0) {
			this.radius = 0;
		}
	}
	public double getRadius() {
		 return this.radius;
	}
	public double getArea() {
		return pi * radius * radius;
		
	}

}

 class Cylinder extends Circle{
	  double height;
	 
	public Cylinder(double radius, double height){
		  super(radius);
		 this.height = height;
	 }
	
	public void setHeight(double height) {
		if(height < 0) {
			this.height = 0;
		}
	}
	public double getHeight() {
		return this.height;
	}
	
	public double getVolume() {
		return getArea() * height;
	}
	
}
