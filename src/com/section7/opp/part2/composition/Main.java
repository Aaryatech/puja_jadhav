package com.section7.opp.part2.composition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimensions dimensions = new Dimensions(20,20,5);
		Case theCase = new Case("220B","Dell","240",dimensions);
		
		Resolution resolution = new Resolution(2540, 1440);
		
		Monitor theMonitor = new Monitor("27inch","Acer",27,resolution);
		
		Motherboard motherBoard = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.44");
		 
		PC p1 = new PC(theCase , theMonitor,motherBoard);
		
		p1.getMonitor().drawPixelAt(1500, 1200, "red");
		p1.getMotherboard().loadProgram("windows 1.0");
				
		
		
	  
		Abb b1 = new Abb(12,12,1998);
		
		 Composition c1= new Composition("pooja", b1);
		   // Abb a1 = new Abb(12,12,1998);
		
		Info i1 = new Info(c1,b1);
		i1.getAbb().getBirthday();
		i1.getC1().display();
		
	
		
	  
		
	}

}
