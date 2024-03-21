package com.exception;

//WAP to demonstrate try catch block

public class TryCatchPractical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		
		x = 80;
		y = 0;
		
		try {
			z = x / y;
			System.out.println(z);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
