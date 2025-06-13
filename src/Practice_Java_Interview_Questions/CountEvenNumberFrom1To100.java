package Practice_Java_Interview_Questions;

public class CountEvenNumberFrom1To100 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 300; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
