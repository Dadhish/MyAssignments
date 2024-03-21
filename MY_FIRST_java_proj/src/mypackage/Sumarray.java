package mypackage;

public class Sumarray {

	public static void main(String[] args) {
		int[] sumArray = {12, 44, 20};
		int sum = 0;
		
		for (int i = 0; i < sumArray.length; i++) {
			sum = sum + sumArray[i];
		}
		
		System.out.println("The sum of array is: " + sum);
		

		
	}

}
