package mypackage;

//WAP to calculate the average value of array elements.
//WAP to find the index of an array element.

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = {12, 44, 20, 36};
		int sum = 0;
		
		for (int i = 0; i < sumArray.length; i++) {
			sum = sum + sumArray[i];
		}
		
		
	//to find an average	
		float avg;
		avg = sum/(float)sumArray.length;	//'sumArray.length' defines the values in array.If we add/remove elements
											// in/from an array then it will automatically fetch the elements number 
		
		System.out.println("The sum is: " + avg);
		
		
		//FROM HERE;the index is find...
		for (int i = 0; i < sumArray.length; i++) {
			System.out.println("An element " + sumArray[i] + " has an index " + i);
		}
		
	}

}
