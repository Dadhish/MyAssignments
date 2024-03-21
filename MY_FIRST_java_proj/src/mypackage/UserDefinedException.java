package mypackage;



import java.util.Scanner;


class MyException1 extends Exception{
	int amount;
	public MyException1(int amount) {
		this.amount = amount;
	}
}

class ATM{
    
	int amount,balance;
    
    public void deposite(int amount){        
        this.amount = amount;
        balance = balance + amount;
        System.out.println("Deposited amount is: " + balance + " rs");
        
    }
    
    /*throws is applied after method declaration and then followed by user-defined exception as well as 
     	system defined exception*/
    
    public void withdraw(int amount) throws MyException1,ArithmeticException{        
        
        if (amount >= balance) {

        	try {
				int needs;
				needs = amount - balance;
				throw new MyException1(needs);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("First deposite sufficient amount then withdraw it.");
			}
        	
		} else {
			this.amount = amount;
	        
	        balance = balance - amount;
	        System.out.println("Withdrawn amount is: " + amount + " rs");
	        
	        System.out.println("Remaining amount is: " + balance + " rs");

		}
    }
}

public class UserDefinedException {
	public static void main(String[] args) throws ArithmeticException, MyException1 {
		// TODO Auto-generated method stub
		int amount;
	    
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.println("Enter your deposite amount: ");
	    amount = sc.nextInt();
	     
	    ATM atm = new ATM();
	    atm.deposite(amount);
	    
	    System.out.println("Enter your withdrawn amount: ");
	    amount = sc.nextInt();
	     
	     try {
			atm.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
