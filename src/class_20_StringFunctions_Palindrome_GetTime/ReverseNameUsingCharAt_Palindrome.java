package class_20_StringFunctions_Palindrome_GetTime;

public class ReverseNameUsingCharAt_Palindrome {
	public static void main(String[] args) {
		String name = "radar";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char answer = name.charAt(i);
			reverse = reverse + answer;
		}
		// System.out.println(reverse);
		// System.out.print(reverse);

		boolean a1 = name.equals(reverse);
		System.out.println(a1);
		if (a1 == true) {
			System.out.println("The input is palindrome");
		} else {
			System.out.println("The input is not a palindrome");
		}
	}
}
