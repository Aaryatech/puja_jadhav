package com.collection;

import java.util.LinkedHashSet;

public class LinkHashSet {

	public static void main(String[] args) {
	
		
		LinkedHashSet<String> hs = new  LinkedHashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");////Insertion order iS Maintain
		
		
		//hs.clear()   delete all element
		for(String h1 : hs) {
			System.out.println(h1);
		}
		
		
	}

}
