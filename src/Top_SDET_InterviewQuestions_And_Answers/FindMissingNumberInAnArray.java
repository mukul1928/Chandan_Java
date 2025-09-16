package Top_SDET_InterviewQuestions_And_Answers;

public class FindMissingNumberInAnArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 5, 6 }; // Missing number is 3
		int missingNumber = findmissingNumber(array);
		System.out.println("The missing number is: " + missingNumber);
	}

	public static int findmissingNumber(int[] array) {
		int n = array.length + 1; // Since one number is missing, the length should be n+1
		int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
		int arraySum = 0;
		for (int num : array) {
			arraySum += num;
		}
		return totalSum - arraySum;
	}
}
