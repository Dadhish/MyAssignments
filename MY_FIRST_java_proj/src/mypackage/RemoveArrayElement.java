package mypackage;

//WAP to remove the third element from a array list.

import java.util.ArrayList;

public class RemoveArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a2 = new ArrayList();
		
		System.out.println("Default value is: " + a2);
		System.out.println("Default size is: " + a2.size());
		System.out.println();
				
		a2.add(90000);
		a2.add("AARADHANA");
		a2.add('O');
		a2.add(88.69);
		a2.add(new Integer(23));
		
		System.out.println("After adding elements");
		
		System.out.println("Now value is: " + a2);
		System.out.println("Now size is: " + a2.size());
		System.out.println();
		
		//Any element is removed by directing its index number
		//Here,the element resides on first index is removed i.e. AARADHANA
		a2.remove(1);
		
		System.out.println("After removing an element");
		System.out.println("Now value is: " + a2);
		System.out.println("Now size is: " + a2.size());
		System.out.println();
		
	}

}
