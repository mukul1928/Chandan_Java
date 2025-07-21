package CollectionMethods_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FSt_ExampleMinMax_and_FrequencyMethods {
	public static void main(String[] args) {
		Collection<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 10, 20, 10));
		System.out.println("Min: " + Collections.min(numbers));
		System.out.println("Max: " + Collections.max(numbers));
		System.out.println("Frequency of 10: " + Collections.frequency(numbers, 10));
		
		
		List<String> list = Arrays.asList("A","B","A","C");
		System.out.println(Collections.frequency(list, "A"));
	}
}
