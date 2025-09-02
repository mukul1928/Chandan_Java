package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class PrintEvenIndexedCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = sc.nextLine();
		System.out.println("Even indexed characters in \"" + input + "\":");
		printEvenIndexedCharacters(input);
	}

	static void printEvenIndexedCharacters(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
