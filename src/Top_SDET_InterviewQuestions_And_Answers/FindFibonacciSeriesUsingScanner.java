package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class FindFibonacciSeriesUsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int number = 6;
		int first = 0, second = 1, next;
		System.out.println("Fibonacci series is ");
		for (int i = 0; i <= number; i++) {
			System.out.println(first + "");
			next = second + first;
			first = second;
			second = next;
		}
	}
}
