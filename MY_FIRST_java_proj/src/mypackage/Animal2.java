package mypackage;

class AnimalM{
	public void move() {
		System.out.println("About Animal...");
	}
}
class Cheetah extends AnimalM{
	public void move() {
		System.out.println("Very fast");
	}
}
public class Animal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah cheetah = new Cheetah();
		cheetah.move();
		
		/* Wrapper class */
		//Auto boxing....
		Integer l1 = 15;
		System.out.println("auto boxing is: " + l1);
		
		//Boxing....
		float fl1 = (float) 50.1;
		Float fl2 = fl1;
		
		System.out.println("boxing is: " + fl2);
		
		//Unboxing....
		Double dvDouble = 230.36;
		double dv = dvDouble;
		
		System.out.println("unboxing is: " + dv);
		/* upto here Wrapper class */
		

	}

}
