package CollectionMethods_Examples;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sxth_Example_SynchronizedSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> syncSet = Collections.synchronizedSet(set);
		syncSet.add(10);
		syncSet.add(30);
		synchronized (syncSet) {
			for (int num : syncSet) {
				System.out.println(num);
			}
		}
	}
}
