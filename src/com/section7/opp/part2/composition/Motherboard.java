package com.section7.opp.part2.composition;

public class Motherboard {
	private String model;
	private String manufucturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	public Motherboard(String model, String manufucturer, int ramSlots, int cardSlots, String bios) {
		
		this.model = model;
		this.manufucturer = manufucturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("program"+programName +"is now loading	");
	}
	
	public String getModel() {
		return model;
	}

	public String getManufucturer() {
		return manufucturer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public String getBios() {
		return bios;
	}
	
	

}
