package Practice_Java_Interview_Questions;

public class CompileTimePolymorphism_MethodOverloading {
	void print(String text) {
		System.out.println("print text : " + text);
	}

	void print(int number) {
		System.out.println("print number : " + number);
	}

	public static void main(String[] args) {
		CompileTimePolymorphism_MethodOverloading p = new CompileTimePolymorphism_MethodOverloading();
		p.print("Hello");
		p.print(123);
	}
}
