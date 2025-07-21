package CollectionMethods_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Snd_ExampleSort_Reverse_andSuffleMethod {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6));
		Collections.sort(list);
		System.out.println("Sorted List: " + list);
		Collections.reverse(list);
		System.out.println("Reversed List: " + list);
		Collections.shuffle(list);
		System.out.println("Shuffled List: " + list);
	}
}
