package mypackage;

class Shape{
	public void getArea() {
		System.out.println("This is an area...");
	}
}

class Rectangle extends Shape{
	public void getArea() {
		int l,b,result;
		l = 20;
		b = 50;
		result = l * b;
		System.out.println("Area of Ractangle is: " + result + "m");
	}
}

public class Shape1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle Rg = new Rectangle();
		Rg.getArea();
		

	}

}
