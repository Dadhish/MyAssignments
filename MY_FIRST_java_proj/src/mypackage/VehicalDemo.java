package mypackage;

class Vehical{
	public void drive() {
		System.out.println("Starting a car...");
	}
}
class Car extends Vehical{
	public void drive() {
		System.out.println("Repairing a car...");
	}
}
public class VehicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr = new Car();
		cr.drive();
		

	}

}
