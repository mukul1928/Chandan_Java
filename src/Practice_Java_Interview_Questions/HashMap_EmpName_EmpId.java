package Practice_Java_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

public class HashMap_EmpName_EmpId 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> name = new HashMap<>();
		name.put(12, "Chandan");
		name.put(13, "Mukul");
		name.put(14, "Khushboo");
		name.put(15, "Smita");
		for (Map.Entry<Integer, String> entry : name.entrySet()) 
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
