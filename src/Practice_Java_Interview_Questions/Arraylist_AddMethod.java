package Practice_Java_Interview_Questions;

import java.util.ArrayList;

public class Arraylist_AddMethod 
{
	public static void main(String[] args) 
	{
		ArrayList<Comparable> a = new ArrayList<Comparable>();
		a.add("chandan");
		a.add(1);
		a.add(null);
		a.add(43.43);
		a.add(43.64f);
		System.out.println(a);	
	}
}
