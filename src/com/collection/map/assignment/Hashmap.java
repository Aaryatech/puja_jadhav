package com.collection.map.assignment;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {

		HashMap<Integer , String> hs = new HashMap();
		hs.put(1, "Pooja");
	    hs.put(2, "Rutuja");
	    hs.put(3, "Ankita");
        hs.put(4, "Manisha");
        hs.put(5, "Nutan");
        
		System.out.println(hs);
		
		System.out.println(hs.get(4));///return value
		System.out.println(hs.get(2));
		
		for(Entry m :  hs.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		hs.remove(4);////remover value
		System.out.println(hs);
		
		
		////
		
		HashMap<Integer,Employee> emp = new HashMap<Integer, Employee>();
		
		  Employee e1 = new Employee("Pooja", 24, "IT");
		  Employee e2 = new Employee("Rutuja",25,"IT");
		  Employee e3 = new Employee("Ankita", 22, "Electronic");
		  
		  emp.put(1, e1);
		  emp.put(2, e2);
		  emp.put(3, e3);
		  
		  
		  for(Entry<Integer, Employee> m : emp.entrySet()) {
			  Employee e = m.getValue();
			  System.out.println("Employee"+" "+m.getKey()+"  Info");
			  System.out.println(e.name +" "+e.age +" "+e.dept);
			
		  }
		
		
        
        
	}

}
