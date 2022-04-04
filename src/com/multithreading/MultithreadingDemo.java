package com.multithreading;

class MultiThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println("pooja");
	}
	
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		
    MultiThread m1 = new MultiThread(); 
      m1.start();

	}

}
