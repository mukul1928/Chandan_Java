package Practice_Java_Interview_Questions;

public class PrintMaximumNumberInArray {

	public static void main(String[] args) {

		int ar[] = new int[5];
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 400;
		ar[3] = 800;
		ar[4] = 300;

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + i; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;

				}
			}
		}
		System.out.println(ar[0]);
	}

}
