package class_23_Arrays_StringFunctions_Anagrams_FindAlpha_FindNumeric;

import java.util.Arrays;

public class StringFunction_ToCharArray 
{
	public static void main(String[] args) 
	{
		String name = "chandan";
		char a1[] = name.toCharArray();
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		
		String name1 = "mukul pandey";
		char a2[] = name1.toCharArray();
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));
	}							
}
