package com.section14.exception;

public class Arithmeticxception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		int num1 = 10;
		int num2 = 0;
		
		int result = num1 / num2;////////////exception is occured in try block
		System.out.println("Division is = "+result);
		
		
		int arr[] = {1 ,2,3,4};
		System.out.println(arr[10]);/////array out of boun exceptiom
      }
		catch(ArithmeticException e) {/////handle the exception
			System.out.println("devide by zero not allow");
		}
       catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println("Array out of bound exception");
       }
       
       finally {
    	   System.out.println("Finally block executed");///either exception occure or not
       }
}
}