package Practice_Java_Interview_Questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArrayUsingSet {

	public static void main(String[] args) {
		int ar[] = new int[8];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 50;
		ar[3] = 10;
		ar[4] = 10;
		ar[5] = 40;
		ar[6] = 20;
		ar[7] = 30;

		Set<Integer> s = new LinkedHashSet<Integer>();

		for (int i = 0; i < ar.length; i++) {
			s.add(ar[i]);

		}
		for (Integer arrr : s) {
			System.out.println(arrr);
		}

	}

}
