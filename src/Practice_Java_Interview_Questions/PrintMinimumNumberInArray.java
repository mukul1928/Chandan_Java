package Practice_Java_Interview_Questions;

public class PrintMinimumNumberInArray {

	public static void main(String[] args) {

		int ar[] = new int[5];
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 500;
		ar[3] = 300;
		ar[4] = 400;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[j];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(ar[0]);

	}

}
