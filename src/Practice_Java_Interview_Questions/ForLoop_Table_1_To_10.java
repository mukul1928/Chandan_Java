package Practice_Java_Interview_Questions;

public class ForLoop_Table_1_To_10 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
	}
}
