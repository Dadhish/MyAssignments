package mypackage;

import java.time.Year;

public class Looping_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTRY CONTROL LOOP");
		System.out.println("1. FOR Loop_ _ _");
		
		for (int x = 1; x <= 5; x++){
		    System.out.print(x);
		} 
		System.out.println();
		System.out.println("-------------------------------------------");
		
		System.out.println("2. WHILE Loop_ _ _");
		int y =1;
		
		while (y <= 5) {
			System.out.println(y);
			y++;
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		System.out.println("3. DO-WHILE Loop_ _ _");
		int z =1;
		
		do{
		    System.out.println(z);
		    z++;
		}while (z <= 5);
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		char ch1 = 'a';
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(ch1);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
			
		for (int i = 1; i <= 5; i++) {
			char ch2 = 'a';
			for (int j = 1; j <= 5; j++) {
				System.out.print(ch2);
				ch2++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		char ch3 = 'a';
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				System.out.print(ch3);
				ch3++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("Pattern for NUMBERS.................");
		System.out.println("-------------------------------------------");
		
		System.out.println("Odd number pattern in right triangle...");
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i * 2; j++) {
				if (j % 2 != 0) {
					System.out.print(j);
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		int l,m,n;
		
	    l = 22; m = 44; n = 77;
	    
	    if (l > m){
	        if(l > n){
	            System.out.println("l is the biggest number");
	        }else{
	            System.out.println("n is the biggest number");
	        }
	    }
	    else{
	        if (m > n){
	           System.out.println("m is the biggest number");
	        }else{
	            System.out.println("n is the greater number");
	        }
	    }
	    
	    System.out.println();
		System.out.println("-------------------------------------------");
		
		int p;
		p = 1;
		
		while (p <= 10) {
			System.out.print(p + " ");
			p++;
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
int no,flag;
	    
	    no = 4; flag = 1;
	    
	    for (int i = 2; i < 5; i++)
	    	
	        if (no % 2 == 0){
	            flag = 0;
	        }
	        
	        if(flag == 0){
	            System.out.println("Not a prime number");
	        }else{
	            System.out.println("Prime number");
	        }
	    
	    
	    System.out.println();
		System.out.println("-------------------------------------------");
		
		int h = 1;
		for (int f = 1; f <= 5; f++){
		    for (int g = 1; g <= f; g++){
		        if (h % 2 == 1){
		            System.out.print(1);    
		        }else{
		            System.out.print(0);
		        }
		        h++;
		        
		    }
		    System.out.println("");
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		for (int a = 1; a <= 5; a++)   
	    {  
	        for (int b = 1; b <= a; b++)  
	        {  
	            System.out.print(a + " ");  
	        }  
	        System.out.println();  
	    }
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		int num = 5;
		int f = 1;
		
		for (int i = num; i >= 1; i--) {
			f = f * i;			
		}
		
		System.out.println("The given number factorial is: " + f);
		
		

	}

}
