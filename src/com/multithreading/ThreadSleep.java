package com.multithreading;

public class ThreadSleep extends Thread {
	@Override
	public void run() {
		
		for(int i = 0; i<5 ;i++) {
			
			try {
				Thread.sleep(1000);/////throw the exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
	
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		ThreadSleep t3 = new ThreadSleep();
		
		t1.start();
		try {
			t1.join();/////first thread complete the task after another thread is start
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
	
		

	}

}
