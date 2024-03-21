package mypackage;

public class Conditional_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qw = 84;
		
		System.out.println("1. IF STATEMENT...");
		
		if(qw == 84) {
			System.out.println("The qw is equal to the given value. ");
		}
		
		System.out.println(" ");
		
		System.out.println("------------------------------------");
		
		System.out.println("2. IF...ELSE STATEMENT...");
		
		if (qw != 45) {
			System.out.println("qw isn't equal to the given value.");
		}else {
			System.out.println("qw is qual to the given value.");
		}
		
		int z,x,c;
		z = 56; 
		x = 320; 
		c = 890;
		
		if(z > x) {
			if (z > c) {
				System.out.println("z is a greater number");				
			}else {
				System.out.println(" 'C' is a greater number");
			}
		}else {
			if (x > c) {
				System.out.println("x is a greater number");				
			}else {
				System.out.println("c is a greater number");
			}
		}
		
		System.out.println(" ");
		
		System.out.println("3. NESTED...IF STATEMENT_ _ _ _ _ _");
		
		int percentage = 55;
		
		if (percentage >= 70) {
			System.out.println("Distinction...!!!");
		}else if (percentage >= 60) {
			System.out.println("First class...!!!");
		}else if (percentage >= 50) {
			System.out.println("Second class...!!!");
		}else if (percentage >=35) {
			System.out.println("Third class...!!!");
		}else {
			System.out.println("Fail...!!!");
		}
		
		System.out.println(" ");
		
		System.out.println("4. Switch Case STATEMENT_ _ _ _ _ _ _ _");
		
		int daynum = 2;
		switch (daynum) {
		case 1:
			System.out.println("Today is Monday.");
			break;
		case 2:
			System.out.println("Today is Tuesday.");
			break;
		case 3:
			System.out.println("Today is Wednesday.");
			break;
		case 4:
			System.out.println("Today is Thursday.");
			break;
			
		default:
			System.out.println("OOps....!!!  No proper day is selected...");
			break;
		}

}

}

