package class_5_Calling_Static_Method_Inside_Main_Method;

public class CallingThreeStaticMethodsInsideMainMethod {
	static void add() {
		System.out.println("Addition");
	}

	static void substract() {
		System.out.println("Substraction");
	}

	static void multiply() {
		System.out.println("Multiplication");
	}

	public static void main(String[] args) {
		add();
		substract();
		multiply();

	}

}
