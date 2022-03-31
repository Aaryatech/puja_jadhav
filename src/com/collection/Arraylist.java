package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
    ArrayList<String> name = new  ArrayList();
    name.add("Pooja");
    name.add("Dipali");
    name.add("Suvarna");
    name.add("Akshada");
    name.add("Manisha");   
    
   // name.remove("Manisha");
    System.out.println("Names are \n"+name);
    
    name.add(1, "Sakshi");///when you add element purtiular position
    System.out.println(name);
     
  
    
    name.set(0, "Rutuja");///when you replace the repalce we use set method
    System.out.println(name);
    
    Iterator<String> itr = name.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());/////reterive the element  one by one
    }
    
    System.out.println();
    ArrayList<String> a1 = new  ArrayList();
    a1.add("Lalit");
    a1.add("Sudhir");
    a1.add("Dipak");
    a1.add("Rahul");
    
    System.out.println("Male are \n"+a1);
   // a1.addAll(name);
    //System.out.println(a1);////if you add other collenction element
    
    ArrayList<String> a2 = new  ArrayList(a1);/////add element of other arraylist
    a2.add("pooja");
    a2.add("krushnali");
    a2.add("samiksha");
    a2.add("shital");
    
    System.out.println("Array list \n "+ a2);
	}

}
