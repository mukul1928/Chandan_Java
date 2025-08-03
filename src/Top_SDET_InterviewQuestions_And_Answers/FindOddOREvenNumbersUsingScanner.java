package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class FindOddOREvenNumbersUsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println(number + " is even.");
		} else {
			System.out.println(number + " is odd.");
		}

	}
}
