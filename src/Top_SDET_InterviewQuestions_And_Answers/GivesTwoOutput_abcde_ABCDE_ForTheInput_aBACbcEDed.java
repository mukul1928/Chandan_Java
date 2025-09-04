package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class GivesTwoOutput_abcde_ABCDE_ForTheInput_aBACbcEDed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = sc.nextLine();
		System.out.println("Original String is: " + input);
		separateCharacters(input);
	}

	public static void separateCharacters(String input) {
		StringBuilder lowercase = new StringBuilder();
		StringBuilder uppercase = new StringBuilder();
		for (char ch : input.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				lowercase.append(ch);
			} else {
				uppercase.append(ch);
			}
		}
		System.out.println("Output is lowercase: " + lowercase);
		System.out.println("Output is uppercase: " + uppercase);
	}
}
