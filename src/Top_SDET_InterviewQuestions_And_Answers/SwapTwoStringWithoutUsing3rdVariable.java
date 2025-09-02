package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class SwapTwoStringWithoutUsing3rdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();
		System.out.println("Before Swapping: str1= " + str1 + ",str2= " + str2);
		// Swapping without using a third variable
		str1 = str1 + str2; // Concatenate str1 and str2 and store in str1
		str2 = str1.substring(0, str1.length() - str2.length());
		// Extract the initial part (original str1) from the concatenated string
		str1 = str1.substring(str2.length());// Extract the remaining part (original str2) from the concatenated string
		System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);

	}
}
