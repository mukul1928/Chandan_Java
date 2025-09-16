package Top_SDET_InterviewQuestions_And_Answers;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromAnArray {
	public static void main(String[] args) {
		int[] ar = { 5, 2, 9, 1, 6, 2, 5 };
		int[] uniqueArray = removeDuplicates(ar);
		System.out.println("Array with duplicate removed: ");
		for (int num : uniqueArray) {
			System.out.print(num + " ");
		}
	}

	public static int[] removeDuplicates(int[] ar) {
		Set<Integer> set = new HashSet<>();
		for (int num : ar) {
			set.add(num);
		}
		int[] result = new int[set.size()];
		int i = 0;
		for (int num : set) {
			result[i++] = num;
		}
		return result;
	}
}
