package Top_SDET_InterviewQuestions_And_Answers;

import java.util.ArrayList;

public class FindFirstAndLastElementOfArrayList {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("Apple");
		arraylist.add("Banana");
		arraylist.add("Cherry");
		arraylist.add("Date");
		arraylist.add("Elderberry");
		if (!arraylist.isEmpty()) {
			String firstelement = arraylist.get(0);
			String lastelement = arraylist.get(arraylist.size() - 1);
			System.out.println("First Element: " + firstelement);
			System.out.println("Last Element: " + lastelement);
		} else {
			System.out.println("The ArrayList is Empty.");
		}
	}
}
