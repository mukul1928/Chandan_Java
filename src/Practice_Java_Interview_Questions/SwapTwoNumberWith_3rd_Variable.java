package Practice_Java_Interview_Questions;

public class SwapTwoNumberWith_3rd_Variable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
