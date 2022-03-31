package com.collection.map.assignment;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
	  
		
		TreeMap<Integer,String> map = new TreeMap();
		map.put(100, "Amit");
		map.put(102,"Ravi");
		map.put(101,"vijay");
		map.put(104,"sanjay");
		map.put(103,"sudhir");
		
		
	     for(Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	     
	    // map.remove(104);////remove the value
	     //System.out.println(map);
     // System.out.println("Descending map "+map.descendingMap());
		
      //return key -value pair whose key are less than the specified key
      System.out.println("headmap :"+ map.headMap(102,true));
  
      //return key -value pair whose key are greater than the specified key
      System.out.println("Tailmap :"+map.tailMap(103, true));
      
      
      System.out.println("submap :"+map.subMap(101,104));
      
      System.out.println("Descending map "+map.descendingMap());
	}

}
