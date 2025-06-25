package Practice_Java_Interview_Questions;

class Animal {
	String name = "Animal";
}

class Dog extends Animal {
	String name = "Dog";

	void printNames() {
		System.out.println(name);// Dog
		System.out.println(super.name);// Animal
	}
}

public class SuperKeyword_Variable {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printNames();
	}
}
//first Dog will print then Animal will print