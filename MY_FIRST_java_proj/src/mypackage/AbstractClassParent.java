package mypackage;
/*
 W.A.J.P. Create an abstract class 'Parent' with a method 'message'. 
 It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" 
 and "This is second subclass" respectively. 
 
 Call the methods 'message' by creating an object for each subclass. 
 */
abstract class Parent{
	
	//REGULAR METHOD
	public void anyName() {
		System.out.println("ABCD");
	}
	
	//ABSTRACT METHOD
	public abstract void message();

}

class ChildA extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is the first subclass...");
	}
	
}

class ChildB extends Parent{
	
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is the second subclass...");
	}
		
}

public class AbstractClassParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildA childA = new ChildA();
		childA.message();
		
		
		ChildB childB = new ChildB();
		childB.message();

	}

}
