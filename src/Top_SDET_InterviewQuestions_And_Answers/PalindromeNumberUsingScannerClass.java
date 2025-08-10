package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class PalindromeNumberUsingScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if (isPalindrome(number)) {
			System.out.println(number + " is a Palindrome.");
		} else {
			System.out.println(number + " not a Palindrome.");
		}

		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
	}

	public static boolean isPalindrome(int num) {
		int origionalNumber = num;
		int reversedNumber = 0;
		while (num != 0) {
			int digit = num % 10;
			reversedNumber = reversedNumber * 10 + digit;
			num = num / 10;
		}
		return origionalNumber == reversedNumber;
	}
}
