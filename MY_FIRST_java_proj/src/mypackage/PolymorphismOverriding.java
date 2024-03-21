package mypackage;

class A{
    public void show(){
        System.out.println("In Class A");
    }
}

class B extends A{
    public void show(){
        super.show();	//super is a keyword in Java to run its immediate parent code. 
        				//It is used to avoid creation of objects of that particular class 
        
        System.out.println("In Class B");
    }
}

class C extends B{
    public void show(){
        super.show();		//super is a keyword in Java to run its immediate parent code. 
							//It is used to avoid creation of objects of that particular class 
        
        System.out.println("In Class C");
    }
}
public class PolymorphismOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  if super keyword is been removed the creation of class object of particular class is necessary.
		A a = new A();
	    a.show();
	    	
	    Similarly for B class	
	    B b = new B();
	    b.show();
	    
	    */
		
	    C c = new C();
	    c.show();
	    

	}

}
