package CollectionMethods_Examples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Fith_Example_The_UnModifiableMap_Method {
	public static void main(String[] args) {
		// Creating a modifiable Map
		Map<Integer, String> modifiableMap = new HashMap<>();
		modifiableMap.put(1, "Java");
		modifiableMap.put(2, "Python");
		modifiableMap.put(3, "c++");
		// Creating a UnmodifiableMap
		Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(modifiableMap);
		// Accessing elements(allowed)
		System.out.println("UnmodifiableMap: " + unmodifiableMap);
		// Attempting to modify(throw UnsupportedOperationException)
		unmodifiableMap.put(4, "JavaScript");// This will throw an exception
	}
}
