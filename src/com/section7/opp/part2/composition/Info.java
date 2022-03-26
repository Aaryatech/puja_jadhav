package com.section7.opp.part2.composition;

public class Info {
	Composition c1;
	Abb abb;
	public Info(Composition c1, Abb abb) {
		super();
		this.c1 = c1;
		this.abb = abb;
	}
	public Composition getC1() {
		return c1;
	}
	public Abb getAbb() {
		return abb;
	}
	
	

}
