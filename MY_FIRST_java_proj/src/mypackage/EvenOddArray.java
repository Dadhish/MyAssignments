package mypackage;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] eoarray = {11, 22, 33, 44, 55, 66};
		
		for (int i = 0; i < eoarray.length ; i++){
		    if(eoarray[i] % 2 == 0){
		        System.out.println(eoarray[i] + " is even number");
		    }else{
		        System.out.println(eoarray[i] + " is an odd number");
		    }
		} 

	}

}
