package Top_SDET_InterviewQuestions_And_Answers;

public class FindIfAStringIsPalindrome {
	public static void main(String[] args) {
		String str = "madam";
		System.out.println(isPalindrome(str));
	}

	static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
