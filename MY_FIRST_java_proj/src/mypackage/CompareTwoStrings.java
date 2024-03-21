package mypackage;

//WAP to Compare Two String.

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss1 = "TOPS";
		String ss2 = "TECHNOLOGIES";
		String ss3 = "Tops";
		
		//with the help of equal() method....
		if (ss1.equals(ss2)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings aren't equal");
		}
		
		//with the help of boolean datatype....
		boolean st1 = ss1.equals(ss2);
		System.out.println(st1);
		
		boolean st2 = ss2.equals(ss3);
		System.out.println(st2);
		
		//with the help of equalIgnoreCase() method....
		if (ss1.equalsIgnoreCase(ss3)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}

	}

}
