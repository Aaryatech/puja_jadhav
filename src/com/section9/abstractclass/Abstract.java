package com.section9.abstractclass;

abstract public class Abstract {
	
	abstract void area();
	void display() {
		System.out.println("hello");////we can aslo define not abstrct method in abstract class.
	}
	
}
class Rectangle extends Abstract{

	@Override
	void area() {
		int width = 7;
		int length = 5;
		 int areaOfRectangele = length * width;
		 System.out.println("Area of Rectangle = "+areaOfRectangele);
		
		
	}
	
}
class Square extends Abstract{

	@Override
	void area() {
		int side = 8;
		int areaOfSquare = side * side;
		System.out.println("Area of Squere is = "+areaOfSquare);
				
		
	}
	
}
class Circle extends Abstract{

	@Override
	void area() {
		final double pi = 3.14;
		double radius = 10;
		double areaOfCircle = radius * radius;
		System.out.println("AreaOfCircle = "+areaOfCircle);
		
	}
	
}
