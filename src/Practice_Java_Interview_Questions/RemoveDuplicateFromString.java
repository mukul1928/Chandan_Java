package Practice_Java_Interview_Questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {

		String s1 = "welcome to java";
		String s2 = s1.replace(" ", "");
		String s = "";
		System.out.println(s2);
		char[] ch = s2.toCharArray();
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (mp.containsKey(ch[i])) {

			} else {
				mp.put(ch[i], 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = mp.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			s = s + entry.getKey();
		}
		System.out.println(s);
	}
}
