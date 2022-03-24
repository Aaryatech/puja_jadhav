package com.section6.opp.part1;

public class MainCalculator {

	public static void main(String[] args) {
		SimpleCalculator obj = new SimpleCalculator();
		obj.setFirstNumber(20);
		obj.setSecondNumber(10);
		
		System.out.println("Addition = "+obj.getAdditionResult());
		System.out.println("Substraction = "+obj.getSubstractionResult());
		System.out.println("Multiplication = "+obj.getMultiplicationResult());
		System.out.println("Division = "+obj.getDivisionResult());
		
		
	}

}
