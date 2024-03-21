package mypackage;

class Animal{
	public void makeSound() {
		System.out.println("pew pew...");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("Mew mew...");
	}
}
public class Animal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat ct = new Cat();
		ct.makeSound();

	}

}
