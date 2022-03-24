package com.section6.opp.part1;

public class MainWall {

	public static void main(String[] args) {
		Wall wall = new Wall(5,4);
		System.out.println("Area is = "+wall.getArea());
		
		
		wall.setHeight(-1.5);
		System.out.println("width="+wall.getWidth());
		
        System.out.println("height = "+wall.getHeight());
        
        System.out.println("Area is ="+wall.getArea());
	
	}

}
