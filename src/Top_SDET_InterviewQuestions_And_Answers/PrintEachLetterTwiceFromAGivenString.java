package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class PrintEachLetterTwiceFromAGivenString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = sc.nextLine();
		String doubledString = doubledCharacters(input);
		System.out.println("Doubled Characters: " + doubledString);
	}

	public static String doubledCharacters(String str) {
		StringBuilder doubled = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			doubled.append(ch).append(ch);// Append Each Character twice

		}
		return doubled.toString();
	}
}
