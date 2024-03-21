package com.thread;

//WAP to create one thread by implementing Runnable interface in Class.

class ThDemo2 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(5000);
			for (int i = 3; i < 11; i++) {
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}


public class ThreadWithRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThDemo2 thDemo2 = new ThDemo2();
//		thDemo2.run();
		Thread th1 = new Thread(thDemo2);
		th1.start();
		
		th1.setName("Mama shri");
		System.out.println(th1);
		
	}

}
