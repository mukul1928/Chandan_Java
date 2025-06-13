package Practice_Java_Interview_Questions;

/*
 1
 23
 456
 78910
 */

public class Print_1_23_456_78910 {

	public static void main(String[] args) {

		int n = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(n++);
			}
			System.out.println();
		}
	}

}
