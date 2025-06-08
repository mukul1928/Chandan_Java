package class_35_36_Collection_Programs;

import java.util.Collections;
import java.util.Vector;

public class Vector_Class 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(23);
		v.add(45);
		v.add('V');
		v.add(false);
		v.add(null);
		v.add(3.33);
		v.add(34.644f);
		v.add("Chandan");
		v.add(0);
		v.add(888888888);
		v.add(9223372036854775807l);//long data type range
		v.add(null);
		v.add("Chandan");
		System.out.println(v);
		
		Vector v1 = new Vector();
		v1.add(787);
		v1.add(333);
		v1.add(34);
		v1.add(98);
		v1.add(45);
		v1.add(786);
		v1.add(444);
		v1.add(945);
		Collections.sort(v1);
		System.out.println(v1);
		
				
	}
}
