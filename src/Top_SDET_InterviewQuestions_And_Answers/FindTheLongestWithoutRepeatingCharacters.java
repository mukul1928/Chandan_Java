package Top_SDET_InterviewQuestions_And_Answers;

import java.util.HashSet;

public class FindTheLongestWithoutRepeatingCharacters {
	public static void main(String[] args) {
		String s1 = "abcabcbb";// Expected: "abc", length 3
		String s2 = "bbbbb";// Expected: "b", length 1
		String s3 = "pwwkew";// Expected: "wke", length 3
		String s4 = "";// Expected: "", length 0
		System.out.println("Longest substring without repeating characters in s1: " + lengthOfLongestSubstring(s1));// Output:
																													// 3
		System.out.println("Longest substring without repeating characters in s2: " + lengthOfLongestSubstring(s2));// Output:
																													// 1
		System.out.println("Longest substring without repeating characters in s3: " + lengthOfLongestSubstring(s3));// Output:
																													// 3
		System.out.println("Longest substring without repeating characters in s4: " + lengthOfLongestSubstring(s4));// Output:
																													// 0
	}

	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();
		int maxLength = 0;
		int start = 0;
		int end = 0;
		while (end < s.length()) {
			char currentChar = s.charAt(end);
			if (!set.contains(currentChar)) {
				set.add(currentChar);
				maxLength = Math.max(maxLength, end - start + 1);
				end++;
			} else {
				set.remove(s.charAt(start));
				start++;
			}
		}
		return maxLength;
	}
}
