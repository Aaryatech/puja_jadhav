package com.section6.opp.part1;

public class Car {

	
	private String model;
	private String engine;
	private String colour;
	
	
	public void setModel(String model) {
		String validModel = model;
		if(validModel.equals("carrera") || validModel.equals("commodore")) {
			this.model = model;
		}else {
			this.model = "Unknown";
			
		}
	}
	public String getModel() {
		return this.model;
		
	}
	
}
