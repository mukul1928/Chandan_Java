package Top_SDET_InterviewQuestions_And_Answers;

public class ArrayConsistOfIntegersAndSpecialCharacters_SumOnlyIntegers {
	public static void main(String[] args) {
		String[] array = { "5", "2", "9", "a", "1", "6", "#", "3" };
		int sum = sumIntegers(array);
		System.out.println("Sum of Integers in the array: " + sum);
	}

	public static int sumIntegers(String[] array) {
		int sum = 0;
		for (String element : array) {
			try {
				int num = Integer.parseInt(element);
				sum += num;
			} catch (NumberFormatException e) {
				// Ignore non-integer elements
			}
		}
		return sum;
	}
}
