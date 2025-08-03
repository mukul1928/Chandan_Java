package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class ReverseTheNumberUsingWhileLoop {
	public static void main(String[] args) {
		int no, rev = 0, r, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		no = sc.nextInt();
		a = no;
		while (no > 0) {
			r = no % 10;
			rev = rev * 10 + r;
			no = no / 10;
		}
		System.out.println("Reverse : " + rev);
	}
}
