package Practice_Java_Interview_Questions;

public class RunTimePolymorphism_MethodOverRiding {
	void sound() {
		System.out.println("Animal makes sound ");
	}

	public static void main(String[] args) {
		RunTimePolymorphism_MethodOverRiding a = new RunTimePolymorphism_MethodOverRiding();
		a.sound();
		a = new Dogg();
		a.sound();
		a = new Cat();
		a.sound();
	}
}

class Dogg extends RunTimePolymorphism_MethodOverRiding {
	void sound() {
		System.out.println("Dogs barks ");
	}
}

class Cat extends RunTimePolymorphism_MethodOverRiding {
	void sound() {
		System.out.println("cat meow ");
	}
}