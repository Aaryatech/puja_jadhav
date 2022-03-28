package com.section9.abstractclass;
////shape is interfae in that area and toString is abstract method; and square and rectangle is implements the shape interface
abstract class Shape{
	public String colour;
    abstract double area();
    public abstract String toString();
    
    Shape(String color){
    	System.out.println("Shape constructor called");
    	this.colour = color;	
    }
    public String getColor() {
    	return colour;
    }
}


class Squaree extends Shape{

	double side;
	Squaree(String colour,double side){
		super(colour);
		System.out.println("Cirlce constructor is called");
		this.side = side;
	}
	@Override
	double area() {
		return side * side;
	}

	@Override
	public String toString() {
		return "circle color is "+super.getColor()+" "+"and area is:"+area();
	}
	
}
class Rectanglee extends Shape{
	double length;
	double width;
	
	Rectanglee(String colour,double length,double width){
		super(colour);
		System.out.println("Rectangle constructor is called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

	@Override
	public String toString() {
		
		return "Rectangle color is"+super.getColor()+" "+"and area is :"+area();
	}
	
}
class Test {

	public static void main(String[] args) {

		Squaree s1 = new Squaree("Red", 5);
		
		Rectanglee r1 = new Rectanglee("Blue", 5, 6);
		
		System.out.println(s1.toString());
		System.out.println(r1.toString());
		
	}

}
