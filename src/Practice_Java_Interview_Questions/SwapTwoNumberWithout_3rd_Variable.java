package Practice_Java_Interview_Questions;

public class SwapTwoNumberWithout_3rd_Variable {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
