package Practice_Java_Interview_Questions;

public class PrintAscendingOrderInArray {

	public static void main(String[] args) {

		int[] ar = new int[5];
		ar[0] = 800;
		ar[1] = 200;
		ar[2] = 500;
		ar[3] = 400;
		ar[4] = 100;

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
