package Practice_Java_Interview_Questions;

public class PrintDuplicateInArray_Practice {

	public static void main(String[] args) {

		int[] ar = new int[6];
		ar[0] = 12;
		ar[1] = 12;
		ar[2] = 13;
		ar[3] = 14;
		ar[4] = 16;
		ar[5] = 14;

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println(ar[i]);
				}
			}
		}
	}

}
