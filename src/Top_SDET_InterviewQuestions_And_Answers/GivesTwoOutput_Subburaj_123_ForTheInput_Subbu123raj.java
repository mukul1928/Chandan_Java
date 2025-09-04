package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class GivesTwoOutput_Subburaj_123_ForTheInput_Subbu123raj {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();
		System.out.println("Original String is :" + input);
		separateAlphaAndNumeric(input);
	}

	public static void separateAlphaAndNumeric(String input) {
		StringBuilder alphabet = new StringBuilder();
		StringBuilder numericPart = new StringBuilder();
		for (char ch : input.toCharArray()) {
			if (Character.isLetter(ch)) {
				alphabet.append(ch);
			} else if (Character.isDigit(ch)) {
				numericPart.append(ch);
			}
		}
		System.out.println("Output is alpha: " + alphabet.toString());
		System.out.println("Output is numeric: " + numericPart.toString());
	}
}
