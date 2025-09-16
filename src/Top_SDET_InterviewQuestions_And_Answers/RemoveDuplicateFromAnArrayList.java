package Top_SDET_InterviewQuestions_And_Answers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromAnArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(2);
		arrayList.add(9);
		arrayList.add(1);
		arrayList.add(6);
		arrayList.add(2);
		arrayList.add(5);
		ArrayList<Integer> uniqueList = removeDuplicates(arrayList);
		System.out.println("Arrayist with duplicates removed: ");
		for (int num : uniqueList) {
			System.out.print(num + " ");
		}
	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
		Set<Integer> set = new HashSet<>(list);
		return new ArrayList<>(set);
	}

}
