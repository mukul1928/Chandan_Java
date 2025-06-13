package Practice_Java_Interview_Questions;

/*
 1
 12
 123
 1234
 12345
 */

public class Print_Numbers_In_SequentialOrders {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}

	}

}
