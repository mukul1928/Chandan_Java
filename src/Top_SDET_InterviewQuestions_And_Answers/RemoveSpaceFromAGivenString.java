package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class RemoveSpaceFromAGivenString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String with space: ");
		String input = sc.nextLine();
		String stringWithoutSpaces = removeSpaces(input);
		System.out.println("String without spaces: " + stringWithoutSpaces);
	}

	public static String removeSpaces(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result.append(str.charAt(i));
			}

		}
		return result.toString();
	}
}
