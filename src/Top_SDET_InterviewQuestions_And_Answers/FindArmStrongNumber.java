package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Scanner;

public class FindArmStrongNumber {
	public static void main(String[] args) {
		int arm = 0, a, b, c, d, no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = sc.nextInt();
		d = no;
		while (no > 0) {
			a = no % 10;
			no = no / 10;
			arm = arm + a * a * a;
		}
		if (arm == d) {
			System.out.println("Armstrong number"); //371
		} else {
			System.out.println("Not Armstorng number");
		}
	}
}
