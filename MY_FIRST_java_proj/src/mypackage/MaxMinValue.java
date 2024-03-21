package mypackage;

import java.util.Scanner;

public class MaxMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc45 = new Scanner(System.in);
			
		int[] a=new int[5];
					
		for(int i = 0; i < a.length; i++) {
			
			a[i]= i+ 1;
			
			 System.out.println("Enter The Value : ");
			 a[i] = sc45.nextInt();
		}			
						 
		for(int i=0; i < a.length;i++){
			
			for(int j = i+1; j < a.length; j++){
			      
				if(a[i] > a[j]){
			      	int temp = a[i];
			      	a[i] = a[j];
			      	a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println("a["+ i + "]=" + a[i]);
		}
						 
		System.out.println("Min Value is: " + a[0]);
		System.out.println("Max Value is: " + a[4]);			
	
	}
}
