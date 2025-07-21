package CollectionMethods_Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Trd_Example_BinarySearch_Method 
{
	public static void main(String[] args) {
		List<Integer>list =Arrays.asList(1,3,5,7);
		int index = Collections.binarySearch(list, 5);
		System.out.println(index);
	}
}
