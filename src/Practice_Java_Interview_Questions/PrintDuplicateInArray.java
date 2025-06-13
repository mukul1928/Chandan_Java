package Practice_Java_Interview_Questions;

public class PrintDuplicateInArray {

	public static void main(String[] args) {

		int[] ar = new int[7];
		ar[0] = 4;
		ar[1] = 3;
		ar[2] = 3;
		ar[3] = 5;
		ar[4] = 6;
		ar[5] = 4;
		ar[6] = 8;

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println(ar[i]);
				}
			}
		}

	}

}
