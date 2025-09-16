package Top_SDET_InterviewQuestions_And_Answers;

public class CountOddAndEvenNumberFromGivenArray {
	// input: {1,2,3,4,5,6,7,8,9}
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] count = countOddAndEven(array);
		System.out.println("Even numbers count: " + count[1]);
		System.out.println("Odd numbers count: " + count[0]);
	}

	public static int[] countOddAndEven(int[] array) {
		int[] count = new int[2]; // Index 0 for odd count, Index 1 for even count
		for (int num : array) {
			if (num % 2 == 0) {
				count[1]++; // Increment even count
			} else {
				count[0]++; // Increment odd count
			}
		}
		return count;
	}

}
