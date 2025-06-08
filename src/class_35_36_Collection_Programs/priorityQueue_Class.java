package class_35_36_Collection_Programs;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class priorityQueue_Class 
{
	public static void main(String[] args) 
	{
		PriorityQueue p = new PriorityQueue();
		p.add(809);
		p.add(7);
		p.add(809);
		//p.add("Chandan");
		//p.add('m');
		//p.add(true);
		//p.add(null);
		//p.add("Chandan");
		//p.add('m');
		//p.add(null);
		//p.add(9223372036854775807l);
		p.add(9879);
		p.add(99);
		System.out.println(p);
		
		PriorityQueue p1 = new PriorityQueue();
		p1.add(12);
		p1.add(1);
		p1.add(11);
		p1.add(13);
		p1.add(2);
		p1.add(15);
		p1.add(3);
		//Collections.sort(p1);
		System.out.println(p1);
	}
}
