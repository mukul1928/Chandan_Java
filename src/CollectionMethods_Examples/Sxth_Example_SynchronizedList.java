package CollectionMethods_Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sxth_Example_SynchronizedList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> synList = Collections.synchronizedList(list);
		// Adding elements to the synchronized list
		synList.add("Java");
		synList.add("Python");
		synList.add("Angular");
		// Accessing in a synchronized block
		synchronized (synList) {
			for (String s : synList) {
				System.out.println(s);
			}
		}
	}
}
