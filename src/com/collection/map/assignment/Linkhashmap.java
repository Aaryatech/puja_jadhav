package com.collection.map.assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Linkhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		 map.put(15, "pooja");////insertio order is maintain
		 map.put(11, "kajal");
		 map.put(10, "kajal");
		 map.put(12, "Aarti");
		 map.put(12, "Aarti");////dublicate key not allow
		 
		 map.put(13, "Sakshi");
		 
		 System.out.println(map);
		 
		 map.containsKey(11);
		 System.out.println( map.containsKey(11));///checking conatain available or n
		 
		 //itratring map
		 for(Entry m : map.entrySet()) {
			 System.out.println(m.getKey() +" "+m.getValue());
		 }
		 
	 
		 
		 
		 
	}

}
