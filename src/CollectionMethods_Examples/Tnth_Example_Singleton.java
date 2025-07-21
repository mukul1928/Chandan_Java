package CollectionMethods_Examples;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tnth_Example_Singleton {
	public static void main(String[] args) {
		// Creating a singleton set
		Set<String> singletonSet = Collections.singleton("Java");
		System.out.println("Singleton Set: " + singletonSet);
		// Creating a singleton list
		List<String> singletonList = Collections.singletonList("Java");
		System.out.println("Singleton List: " + singletonList);
		// Creating a singleton Map
		Map<String, Integer> singletonMap = Collections.singletonMap("Java", 100);
		System.out.println("Singleton Map: " + singletonMap);
		// Trying to modify the collections will throw UnsupportedOperationException
		try {
			singletonSet.add("Python");
		} catch (UnsupportedOperationException e) {
			System.out.println("Cannot modify singleton Set");
		}
		try {
			singletonList.add("Python");
		} catch (UnsupportedOperationException e) {
			System.out.println("Connot modify singleton List");
		}
		try {
			singletonMap.put("Python", 200);
		} catch (UnsupportedOperationException e) {
			System.out.println("Cannot modify singleton Map");
		}
	}
}
