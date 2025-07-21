package CollectionMethods_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Nith_Example_Copy {
	public static void main(String[] args) {
		List<String> src = Arrays.asList("Java", "Python", "C++");
		List<String> dest = new ArrayList<>(Arrays.asList("A", "B", "C"));
		// Copy source list into destination list
		Collections.copy(dest, src);
		System.out.println("Destination after copy: " + dest);

	}

}
