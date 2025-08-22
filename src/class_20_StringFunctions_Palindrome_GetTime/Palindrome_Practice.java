package class_20_StringFunctions_Palindrome_GetTime;

public class Palindrome_Practice {
	public static void main(String[] args) {
		String name = "kadak";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ans = name.charAt(i);
			reverse = reverse + ans;
		}
		boolean ans = name.equals(reverse);
		System.out.println(ans);
		if (ans == true) {
			System.out.println("palindrome ");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
