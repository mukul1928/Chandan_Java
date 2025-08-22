package class_23_Arrays_StringFunctions_Anagrams_FindAlpha_FindNumeric;

import java.util.Arrays;

public class Anagram_Practice {
	public static void main(String[] args) {
		String name1 = "silent";
		String name2 = "listen";
		if (name1.length() != name2.length()) {
			System.out.println("The given string are not an anagrams");
		} else {
			char n1[] = name1.toCharArray();
			char n2[] = name2.toCharArray();
			Arrays.sort(n1);
			Arrays.sort(n2);
			System.out.println(Arrays.toString(n1));
			System.out.println(Arrays.toString(n2));
			boolean ans = Arrays.equals(n1, n2);
			System.out.println(ans);
			if (ans == true) {
				System.out.println("They are anagrams");
			} else {
				System.out.println("They are not an anagrams");
			}
		}
	}

}
