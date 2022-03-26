package com.section6.part1.inheritance;

public class MainCuboid {

	public static void main(String[] args) {
		
		Rectangle  r1 = new Rectangle(5,10);
		System.out.println("rectangle.width ="+r1.getWidth());
		System.out.println("rectangle.length ="+r1.getLenth());
		System.out.println("Rectangle.area ="+r1.getArea());
		
		Cuboid c1 = new Cuboid(5,10,5);
		System.out.println("cuboid.width="+c1.getWidth());
		System.out.println("cuboid.length="+c1.getLenth());
		System.out.println("cuboid.area ="+c1.getArea());
		System.out.println("cuboid.height ="+c1.getHeight());
		System.out.println("cuboid.volume ="+c1.getVolume());
		
		
		

}
}