package Practice_Java_Interview_Questions;

public class Continue_Keyword {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}
	}
}
