package mypackage;

//W.A.J.P. to create a custom exception if Customer withdraw amount which is greater than account balance 
//then program will show custom exception otherwise amount will deduct from account balance. 
//Account balance is:2000 Enter withdraw amount:2500 Sorry, insufficient balance, you need more 500 Rs. 
//To perform this transaction.

class CustomExceptionForAccount{
	int amount;
	
	//constructor
	
	public CustomExceptionForAccount(int amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
	}	
}


class Account{
    
	int amount,balance;
    
    public void deposit(int amount){        
        this.amount = amount;
        
        balance = balance + amount;
        
        System.out.println("Deposited amount is: " + balance + " rs");
        
    }
	
	public void withdraw(int amount) {
		
		this.amount = amount;
		
		if (amount > balance) {
			
			int needs;
			needs = amount - balance;
			System.out.println("You've not sufficient account balance,so please deposite " + needs + 
									" rs more then you will able to withdraw.");
		}else {
			int withdraw = balance - amount;
			System.out.println("Withdrawn amount is: " + withdraw + " Rs.");
			
			balance = balance - withdraw;
			System.out.println("Remaining balance is: " + balance);
			
		}	
	}
}



public class AccountBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.deposit(7000);
		
		account.withdraw(8000);
		
		
		
	}

}
