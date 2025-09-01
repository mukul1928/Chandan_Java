package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class PrintUniqueCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String input = sc.nextLine();
		System.out.println("Unique characters in \"" + input + "\":");
		printUniqueCharacters(input);
	}

	public static void printUniqueCharacters(String str) {
		// Assume ASCII characters (0-127), use boolean array to track character
		// occurrences
		boolean[] unique = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!unique[ch]) {
				unique[ch] = true;
				System.out.print(ch + " ");
			}
		}
	}
}
