package Practice_Java_Interview_Questions;

import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueNumberInArray {

	public static void main(String[] args) {
		int[] ar = new int[7];
		ar[0] = 4;
		ar[1] = 3;
		ar[2] = 3;
		ar[3] = 6;
		ar[4] = 4;
		ar[5] = 1;
		ar[6] = 2;

		Set<Integer> arlist = new TreeSet<>();
		for (int i = 0; i < ar.length; i++) {
			arlist.add(ar[i]);

		}

		System.out.println(arlist);
	}

}
