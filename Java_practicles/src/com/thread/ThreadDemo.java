package com.thread;

//WAP to create one thread by extending Thread class in another Class.
class ThDemo extends Thread{
	public void m1() {
		System.out.println("This is prograqm for THREAD........." + currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("THis is another thread12121.........");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is prograqm for THREAD77........." + currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("THis is another thread31313131.........");
	}
}
public class ThreadDemo {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThDemo thDemo = new ThDemo();
		
		thDemo.start();
		thDemo.suspend();
		thDemo.m1();
		
		
//		for(int i =0; i<100;i++) {
//			System.out.println(i);
//		}

	}

}
