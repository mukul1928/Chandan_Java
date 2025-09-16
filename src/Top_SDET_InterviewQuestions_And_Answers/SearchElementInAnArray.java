package Top_SDET_InterviewQuestions_And_Answers;

public class SearchElementInAnArray {
	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 1, 6, 3 };
		int target = 6;
		int index = linearsearch(array, target);
		if (index != -1) {
			System.out.println("Element " + target + "found at index: " + index);
		} else {
			System.out.println("Element " + target + " not found in the array.");
		}
	}

	public static int linearsearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i; // Element found, return index
			}
		}
		return -1; // Element not found
	}
}
