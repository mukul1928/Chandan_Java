package class_23_Arrays_StringFunctions_Anagrams_FindAlpha_FindNumeric;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String name1 = "chin";
		String name2 = "inch";
		if (name1.length() != name2.length()) {
			System.out.println("Sorry the given two strings are not anagrams");
		} else {
			char n1[] = name1.toCharArray();
			char n2[] = name2.toCharArray();
			Arrays.sort(n1);
			Arrays.sort(n2);
			System.out.println(Arrays.toString(n1));
			System.out.println(Arrays.toString(n2));
			boolean answer = Arrays.equals(n1, n2);
			System.out.println(answer);
			if (answer == true) {
				System.out.println("The given two strings are anagrams");
			} else {
				System.out.println("They are not anagrams");
			}
		}
	}
}
