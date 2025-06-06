package class_32_SwitchCase_ThreadSleep_MathClass_AssertKeyword;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AssertKeyword 
{
	public static void main(String[] args) 
	{
		int age[] = new int[3];
		age[0] = 12;
		age[1] = 11;
		age[2] = 14;
		
		
		int ageofparents[] = new int[3];
		ageofparents[0] = 35;
		ageofparents[1] = 37;
		ageofparents[2] = 39;
		
		assert Array.getLength(age)>10;
		
		boolean answer = Arrays.equals(age, ageofparents);// enquals method is for my values of both of the Arrays so both
														// of Arrays values are different so I will get false
		System.out.println(answer);
				 
	}
}
