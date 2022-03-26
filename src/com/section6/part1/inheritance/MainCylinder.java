package com.section6.part1.inheritance;

public class MainCylinder {

	public static void main(String[] args) {
	
		Circle area = new Circle(3.75);
		System.out.println("circle.radius ="+area.getRadius());
		System.out.println("circle.area = "+area.getArea());
		
		Cylinder cylinder = new Cylinder(5.55,7.25);
		System.out.println("cylinder.radius = "+cylinder.getRadius());
		System.out.println("cylinder.radius ="+cylinder.getHeight());
		System.out.println("cylinder.area ="+cylinder.getArea());
		
		System.out.println("cylinder.volume = "+cylinder.getVolume());
		

	}

}
