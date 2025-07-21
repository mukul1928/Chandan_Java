package CollectionMethods_Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Svnth_Example_DisJoint {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
		List<Integer> list3 = Arrays.asList(4, 7, 9);
		// Check if list1 and list2 are disjoint
		boolean result1 = Collections.disjoint(list1, list2);
		System.out.println("list1 and list2 disjoint? " + result1); // Output true
		// Check if list1 and list3 are disjoint
		boolean result2 = Collections.disjoint(list1, list3);
		System.out.println("list1 and list3 disjoint? " + result2);// Output false
	}
}
