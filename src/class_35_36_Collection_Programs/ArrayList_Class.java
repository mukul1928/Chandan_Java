package class_35_36_Collection_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Class 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add(987);
		a1.add(876);
		a1.add("Chandan");
		a1.add(false);
		a1.add('M');
		a1.add(3.34);
		a1.add(null);
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(76);
		a2.add(32);
		a2.add(90);
		a2.add(75);
		a2.add(0);
		a2.add(890);
		a2.add(7);
		Collections.sort(a2);
		System.out.println(a2);
		
		
				
		
	}
}
