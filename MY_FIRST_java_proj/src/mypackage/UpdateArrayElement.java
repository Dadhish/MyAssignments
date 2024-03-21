package mypackage;

//WAP to update specific array element by given element.

public class UpdateArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to initialize an array
		int[] array1 = {8, 88, 69, 123, 654};
		
		
		
		System.out.print("Before update ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		
		array1[3] = 963;
		
		System.out.print("After update ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

	}

}
