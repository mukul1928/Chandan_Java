package Practice_Java_Interview_Questions;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		String n1 = "listen";
		String n2 = "silent";
		if (n1.length() != n2.length()) {
			System.out.println("The given String are not an Anagrams");
		} else {
			char name1[] = n1.toCharArray();
			char name2[] = n2.toCharArray();
			Arrays.sort(name1);
			Arrays.sort(name2);
			System.out.println(Arrays.toString(name1));
			System.out.println(Arrays.toString(name2));
			boolean ans = Arrays.equals(name1, name2);
			System.out.println(ans);
			if (ans == true) {
				System.out.println("They are anagrams");
			} else {
				System.out.println("They are not an anagrams");
			}
		}
	}
}
