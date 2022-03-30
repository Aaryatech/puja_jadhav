package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
	
    ArrayList<Integer> l1 = new ArrayList();
    l1.add(5);
    l1.add(4);
    l1.add(11);
    l1.add(8);
    l1.add(9);
    l1.add(10);
    l1.add(1);
    l1.add(2);
    l1.add(3);
    
    System.out.println("Numbers are \n "+l1);
        
    Collections.sort(l1);
    System.out.println(l1);
    
    

	}

}
