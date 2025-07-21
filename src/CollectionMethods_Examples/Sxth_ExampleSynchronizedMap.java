package CollectionMethods_Examples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Sxth_ExampleSynchronizedMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> synMap = Collections.synchronizedMap(map);
		synMap.put("Java", 10);
		synMap.put("Python", 20);
		synchronized (synMap) {
			for (Map.Entry<String, Integer> entry : synMap.entrySet()) {
				System.out.println(entry.getKey() + "->" + entry.getValue());
			}
		}
	}
}
