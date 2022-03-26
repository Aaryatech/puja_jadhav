package com.sectiom8.array;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println("myIntArry ="+Arrays.toString(myIntArray));
		
		System.out.println("myIntArry ="+Arrays.toString(anotherArray));
		anotherArray[0] = 1;
		System.out.println("myIntArry ="+Arrays.toString(myIntArray));
		System.out.println("myIntArry ="+Arrays.toString(anotherArray));
	
	}

}
