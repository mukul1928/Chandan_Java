package class_24_FindSpace_Alphabets_Numeric_SpecialCharacters_CopyValueOfOneArrayIntoAnotherUsingIteration;

import java.util.Arrays;

public class CopyValueFromOneArrayIntoOtherUsingIteration 
{
	public static void main(String[] args) 
	{
		int array1[] = new int[4];
		array1[0] = 12;
		array1[1] = 23;
		array1[2] = 32;
		array1[3] = 43;
		
		int array2[] = new int[array1.length];
		for(int i = 0;i<4;i++)
		{
			array2[i] = array1[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}
}
