package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetHashSet {

	public static void main(String[] args) {
	
    Set<Integer> s1 = new HashSet();
    
      s1.add(1);
      s1.add(2);
      s1.add(3);
      s1.add(4);
      s1.add(5);
      s1.add(6);
      s1.add(7);
     // s1.add(7);  in set dublicate not allow
      
      System.out.println("Integer are \n"+s1);
    
      Set<Integer> s2 = new HashSet();
      s2.add(0);
      s2.add(1);
      s2.add(2);
      s2.add(3);
      s2.add(8);
      s2.add(9);
      s2.add(10);
      
      System.out.println("Integer s2 \n"+s2);
      System.out.println("size "+s2.size());
      
   System.out.println(s2.contains(10)+"check element present or not");
      
      s2.addAll(s1);
      System.out.println("Union of two set = "+s2);//add on element one set to another
      
      s2.removeAll(s1);
      System.out.println("Differene between two set "+s2);
  
      s2.retainAll(s1);
      System.out.println("Intersection of two set "+s2);///retain  element common
   
   
      
      
      

	}

}
