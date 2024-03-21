package mypackage;

//W.A.J.P. which will ask the user to enter his/her marks (out of 100). 
//Define a method that will display grades according to the marks entered as below:

//Marks Grade 	91-100 AA;
//				81-90 AB;
//				71-80 BB; 
//				61-70 BC; 
//				51-60 CD;
//				41-50 DD;
//				<=40 Fail

//This program is done with various programming concepts mentioned below 
class Mark{
	int Marks;
	String grade;
	
	//programming concept 1: FUNCTION WITHOUT PARAMETER;WITHOUT RETURN TYPE
	public void distinction1() {
		Marks = 91;
		grade = "AA";
		
		if (Marks >= 91 && Marks <= 100) {	
			System.out.println("Your Marks are: " + Marks +  " and grade is: " + grade);
		}
		
	}
	
	//programming concept 2: FUNCTION WITHOUT PARAMETER;WITH RETURN TYPE
	public String distinction2() {
		Marks = 81;
		if (Marks >= 81 && Marks <= 90) {
			grade = "AB";
		}		
		return grade;
	}
		
	public void showDistinction2Data(){
	    System.out.println("Your Marks are: " + Marks + " and grade is: " + grade);	    
	}
	
	//programming concept 3: FUNCTION WITH PARAMETER;WITH RETURN TYPE
	public String distinction3(int marks,String gr) {
		
		if (marks >= 71 && marks <= 80) {
			Marks = marks;
			grade = gr;
		}
		return grade;		
	}
		
	public void showDistinction3Data() {
		 System.out.println("Your Marks are: " + Marks + " and grade is: " + grade);	    
	}
	
	//programming concept 3: FUNCTION WITH PARAMETER;WITHOUT RETURN TYPE
	public void firstClass(int marks,String gr) {
		if (marks >= 61 && marks <= 70) {
			Marks = marks;
			grade = gr;
		}		
	}
	
	public void showFirstClass() {
		System.out.println("Your Marks are: " + Marks + " and grade is: " + grade);
	}
	
	public void remainGrades() {
		Marks = 56;	//To get different output;change the value here
		grade = "CD";
		if (Marks >= 51 && Marks <= 60) {
			System.out.println("Your Marks are: " + Marks +  " and grade is: " + grade);
		}else if (Marks >= 41 && Marks <= 50) {
			grade = "DD";
			System.out.println("Your Marks are: " + Marks +  " and grade is: " + grade);
		}else {
			System.out.println("OMG!!! You're fail...Please try again...");
		}
	}
	
	
}

public class MarksWithGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mark mark;
		
		mark = new Mark();
		
		
		mark.distinction1();
		
		mark.distinction2();
		mark.showDistinction2Data();
		
		mark.distinction3(77, "BB");
		mark.showDistinction3Data();
		
		mark.firstClass(69, "BC");
		mark.showFirstClass();
		
		mark.remainGrades();	

	}

}
