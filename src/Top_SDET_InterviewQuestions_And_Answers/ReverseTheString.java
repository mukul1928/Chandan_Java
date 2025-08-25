package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class ReverseTheString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = sc.nextLine();
		char ch;
		String nstr = "";
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			nstr = ch + nstr;

		}
		System.out.println("Reversed String is : " + nstr);
	}
}
