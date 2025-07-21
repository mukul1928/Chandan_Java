package CollectionMethods_Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frt_Example_RotateLeft {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Collections.rotate(list, -2);
		System.out.println(list);
	}

}
