package com.collection;

import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {
	
     LinkedList<String> fruit = new LinkedList();
     
     fruit.add("Mango");
     fruit.add("Banana");
     fruit.add("Watermelon");
     fruit.add("Apple");
     
     System.out.println("Fruits are \n"+fruit);
     
     fruit.addFirst("Orange");//in linked list we add or remove element both side
     System.out.println(fruit);
     
     

	}

}
