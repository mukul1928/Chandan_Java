package class_35_36_Collection_Programs;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSet_Class 
{
	public static void main(String[] args) 
	{
		LinkedHashSet l = new LinkedHashSet();
		l.add(980);
		l.add(78);
		l.add('m');
		l.add("chandan");
		l.add(null);
		l.add(true);
		l.add(null);
		l.add(3.34);
		l.add(87.89f);
		l.add(9223372036854775807l);
		l.add("chandan");
		System.out.println(l);
		
		LinkedHashSet l2 = new LinkedHashSet();
		l2.add(89);
		l2.add(6);
		l2.add(90);
		l2.add(45);
		l2.add(23);
		l2.add(46);
		l2.add(4);
		l2.add(34);
	//	Collections.sort(l2);
		System.out.println(l2);
		
		
	}
}
