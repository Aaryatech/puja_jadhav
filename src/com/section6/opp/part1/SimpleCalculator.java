package com.section6.opp.part1;

public class SimpleCalculator {

	
	private double firstNumber;
	private double secondNumber;
	
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
		
	}
	public double getFirstNumber() {
		return this.firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
		
	}
	public double getSecondNumber() {
		return this.secondNumber;
	}
	public double getAdditionResult() {
		return this.firstNumber + this.secondNumber;
		
	}
	public double getSubstractionResult() {
		return this.firstNumber - this.secondNumber;
		
	}
	public double getMultiplicationResult() {
		return this.firstNumber * this.secondNumber;
		
	}
	public double getDivisionResult() {
		return this.firstNumber / this.secondNumber;
		
	}
	
	
	
}
