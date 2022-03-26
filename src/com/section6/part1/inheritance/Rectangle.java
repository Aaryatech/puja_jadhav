package com.section6.part1.inheritance;

public class Rectangle {
	
	 double width;
	double length;
	
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	public void setWidth(double width) {
		if(width < 0) {
			this.width = 0;
		}
	}
	public double getWidth() {
		return this.width;
	}
	public void setLength(double length) {
		if(length < 0) {
			this.length =0;
		}
	}
	public double getLenth() {
		return this.length;
	}
	
	public double getArea() {///////calculate Area
		return width *  length;
	}
}
class Cuboid extends Rectangle{
	double height;
	
	Cuboid(double width, double length, double height){
		super(width,length);
		this.height = height;
	}
	public void setHeight(double height) {
		if(height < 0) {
			this.height =0;
		}
	  }
	public double getHeight() {
		return this.height;
	}
	
	public double getVolume() {
		
		return getArea() * height;
	}
	
}
