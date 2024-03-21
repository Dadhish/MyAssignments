package mypackage;

//WAP to Copy one array into another

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] first_array = new int[5];
		
		first_array[0] = 55;
		first_array[1] = 100;
		first_array[2] = 88;
		first_array[3] = 155;
		first_array[4] = 987;
		
		System.out.print("This is the first array: ");
		for (int i = 0; i < first_array.length; i++) {
			
			System.out.print(first_array[i] + " ");
		}
		
		System.out.println();

		int[] second_array = new int[first_array.length];
		
		System.out.print("This is the second array: ");
		for (int i = 0; i < second_array.length; i++) {
			second_array[i] = first_array[i];
			System.out.print(second_array[i] + " ");
		}
	}

}
