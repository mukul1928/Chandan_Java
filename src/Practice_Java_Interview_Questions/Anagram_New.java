package Practice_Java_Interview_Questions;

import java.util.Arrays;

public class Anagram_New {
	static boolean areanagrams(String str1, String str2) {
		char[] s1Array = str1.toCharArray();
		char[] s2Array = str2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		return Arrays.equals(s1Array, s2Array);
	}

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		System.out.println(areanagrams(s1, s2));
	}
}
