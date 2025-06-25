package Practice_Java_Interview_Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashmap_EmpKey_Value 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> map = new HashMap<>();
		map.put("VishnuG", 01);
		map.put("BharmaG", 02);
		map.put("ShivG", 03);
		map.put("RamG", 04);
		map.put("HanumanG", 05);
		map.put("KrishnaG", 06);
		map.put("GaneshG", 07);
		// map.put("ShaniG", 08);
		for (Map.Entry<String, Integer> element : map.entrySet())
		{
			System.out.println("Key:" + element.getKey() + " Value:" + element.getValue());
		}
		
		//Wrtie the program to the HashSet to remove the duplicate from this below lists?
		
		Set<String> set = new HashSet<>();
		set.add("Alice");
		set.add("Bob");
		set.add("Charlie");
		set.add("Alice");
		set.add("Bob");
		set.add("Charlie");
		System.out.println(set);
	}
}
