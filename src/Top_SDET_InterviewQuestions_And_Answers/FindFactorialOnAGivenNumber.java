package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class FindFactorialOnAGivenNumber {
	public static void main(String[] args) {
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number ");
		int number = 5;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial number is :" + factorial);
	}
}
