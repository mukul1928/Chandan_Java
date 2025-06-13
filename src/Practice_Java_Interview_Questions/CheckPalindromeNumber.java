package Practice_Java_Interview_Questions;

public class CheckPalindromeNumber {

	public static void main(String[] args) {

		int num = 12321;
		int temp = num;
		int rev = 0;
		while (num > 0) {
			int n = num % 10;
			rev = (rev * 10) + n;
			num /= 10;
		}
		if (rev == temp) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not a palindrome number");
		}
	}

}
