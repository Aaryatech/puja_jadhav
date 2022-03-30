package com.collection;

import java.util.TreeSet;

public class Treset {

	public static void main(String[] args) {
	

		TreeSet<Integer> t1 = new TreeSet();
		
		
		  t1.add(101);
		  t1.add(112);
		  t1.add(114);
		  t1.add(111);
		  t1.add(105);
		  t1.add(108);
		  t1.add(121);
		  t1.add(113);
		  
		  System.out.println(t1);////element return in asebding order
		  System.out.println("desending order ="+t1.descendingSet());
		  
		  System.out.println("lowest value ="+	t1.pollFirst());//rremove element 
		  System.out.println("Heighest value = "+t1.pollLast());
		  System.out.println(t1);
		  
		  System.out.println("head set"+t1.headSet(112,true));
		  
		  System.out.println(t1.higher(112));
		  System.out.println(t1.lower(112));
		
	}

}
