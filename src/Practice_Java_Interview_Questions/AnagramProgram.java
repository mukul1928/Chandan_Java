package Practice_Java_Interview_Questions;

import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramProgram {
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		boolean ans = str1.length() == str2.length() && str1.chars().boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).equals(str2.chars().boxed()
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		if (ans) {
			System.out.println("anagrams");
		} else {
			System.out.println("not an anagrams");
		}
	}

}
