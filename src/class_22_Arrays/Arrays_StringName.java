package class_22_Arrays;

import java.util.Arrays;

public class Arrays_StringName 
{
	public static void main(String[] args) 
	{
		String name[] = new String[5];
		name[0] = "Chandan";
		name[1] = "Smita";
		name[2] = "Khushboo";
		name[3] = "Priyanka";
		name[4] = "Asmita";
		
		//Arrays.sort(name);
		
		/*
		for (int i = 0; i <= 4; i++) 
		{
			System.out.println(name[i]);
		}
		*/
		
		System.out.println(Arrays.toString(name));// another way of printing the values 
	}
}
