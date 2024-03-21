package mypackage;

//WAP to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
				
		ArrayList a2 = new ArrayList();
				
		System.out.println("Default Value is: " + a2);
		System.out.println("Default Size is: " + a2.size());
		System.out.println();
		
		
		a2.add(100);
		a2.add(12.5f);
		a2.add('C');
		a2.add("Charmi");
		a2.add(new Integer(10));
		
		
		
		System.out.println("Now Value is: " + a2);
		System.out.println("Now Size is: " + a2.size());
		System.out.println();

		
		//If we want to display elements in LIST form then use ITERATOR.				
		Iterator i1=a2.iterator();
				
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}		

	}
}

	