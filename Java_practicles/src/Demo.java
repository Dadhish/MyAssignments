abstract class Shape{
    public abstract void calarea();
    public abstract void calperimeter();
    
}

class Circle extends Shape{
	
	@Override
	public void calarea() {
		
		int r,CA;
		r = 10;
        CA = (int) (3.14 * r * r);
        System.out.println("The area of circle is: " + CA);

	}

	@Override
	public void calperimeter() {
		int r1,CT;
		r1 = 10;
		CT = (int) (2 * 3.14 * r1);
		System.out.println("The perimeter if circle is: " + CT);
		
	}
	
}

class Triangle extends Shape{

	@Override
	public void calarea() {
		int b,h,TA;
		b = 20;
		h = 10;
		TA = (b * h)/2;
		System.out.println("The area of triangle is: " + TA);
		
	}

	@Override
	public void calperimeter() {
		int a, b, c, P;
        a = 20; 
        b = 10;
        c = 20;
        P = a + b + c;
        System.out.println("The perimeter of triangle is: " + P);
		
	}
	
}

public class Demo {
public static void main(String[] args) {
	
	System.out.println(">>>>>>>For Circle.....");
	
	Circle c1=new Circle();
	c1.calarea();
	c1.calperimeter();
	
	System.out.println();
	
	System.out.println(">>>>>>>For Triangle.....");
	Triangle t = new Triangle();
	t.calarea();
	t.calperimeter();
}
}
