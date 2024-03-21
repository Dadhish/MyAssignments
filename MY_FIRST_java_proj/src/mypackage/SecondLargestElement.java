package mypackage;

//WAP to find the second largest element in an array.

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array55 = new int[6];
		
		Scanner sc4 = new Scanner(System.in);
		
		//This for loop is used to take inputs only
		for (int i = 0; i < array55.length; i++) {
			array55[i] = i + 1;
			
			System.out.println("Enter a value: ");
			
			array55[i] = sc4.nextInt();
			
		}
		
		//This for loop is used to display output
		/*
		for (int i = 0; i < array55.length; i++) {
			System.out.println("arrray55["+ i + "]= " + array55[i]);
			
		}*/
		
		for (int i = 0; i < array55.length; i++) {
			for (int j = i + 1; j < array55.length; j++) {
				if (array55[i] > array55[j]) {
					
					int temp = array55[i];
					array55[i] = array55[j];
					array55[j] = temp;
					
				}
				
			}
			
		}
		 
		for (int i = 0; i < array55.length; i++) {
			System.out.println("array55[" + i + "]=" + array55[i]);
		}
		
		System.out.println("Second Largest Value is: " + array55[4]);
		
			 
		/*for (int i = 0; i < array_element.length; i++) {
			array_element[i] = i + 1;
			
			System.out.println("Enter the value: ");
			//........MISTAKE........//
			array_element = sc77.nextInt();
			//........MISTAKE........//
		}*/
		


	}

}
