package Practice_Java_Interview_Questions;

public class Print_Duplicate_In_Array {

	public static void main(String[] args) {

		int[] ar = new int[5];
		ar[0] = 324;
		ar[1] = 334;
		ar[2] = 243;
		ar[3] = 324;
		ar[4] = 334;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println(ar[i]);
				}
			}
		}

	}

}
