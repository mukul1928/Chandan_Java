package class_35_36_Collection_Programs;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Class 
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add(65);
		l.add(454553534);
		l.add('C');
		l.add("Chandan");
		l.add(null);
		l.add(null);
		l.add("Chandan");
		l.add(9223372036854775807l);
		l.add(false);
		l.add(56.565646544);
		System.out.println(l);
		
		LinkedList l2 = new LinkedList();
		l2.add(343);
		l2.add(33);
		l2.add(333);
		l2.add(798);
		l2.add(78999);
		l2.add(977777);
		l2.add(68);
		l2.add(1);
		l2.add(0);
		Collections.sort(l2);
		System.out.println(l2);
		
		
		
	}
}
