package CollectionMethods_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Egth_Example_Fill {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript"));
		// Replace all elements with "Unknown"
		Collections.fill(list, "Unknown");
		System.out.println("List after fill " + list);
	}
}
