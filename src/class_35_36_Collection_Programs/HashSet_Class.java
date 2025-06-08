package class_35_36_Collection_Programs;

import java.util.Collections;
import java.util.HashSet;

public class HashSet_Class 
{
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(2);
		h.add(343);
		h.add(98);
		h.add(9223372036854775807l);
		h.add(9223372036854775807l);
		h.add('M');
		h.add("Chandan");
		h.add("Chandan");
		h.add(null);
		h.add(false);
		h.add(22.3809809809);
		h.add(33.34f);
		System.out.println(h);
		
		HashSet h1 = new HashSet();
		h1.add(79);
		h1.add(9);
		h1.add(6);
		h1.add(90);
		h1.add(98);
		h1.add(0);
	//	Collections.sort(h1);
		System.out.println(h1);
	}
}
