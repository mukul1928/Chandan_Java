package Practice_Java_Interview_Questions;

public class MultipleCatchExample {
	public static void main(String[] args) {
		try {
			int[] ar = new int[5];
			ar[5] = 100;
			int result = 10 / 0;

			// System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}
}
