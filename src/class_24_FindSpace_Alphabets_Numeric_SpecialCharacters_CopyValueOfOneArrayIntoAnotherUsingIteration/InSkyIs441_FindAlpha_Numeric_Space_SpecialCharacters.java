package class_24_FindSpace_Alphabets_Numeric_SpecialCharacters_CopyValueOfOneArrayIntoAnotherUsingIteration;

public class InSkyIs441_FindAlpha_Numeric_Space_SpecialCharacters 
{
	public static void main(String[] args) 
	{
		String name = "sky is 441 %^$";
		char c[] = name.toCharArray();
		int count_of_alpha=0;
		int count_of_numeric=0;
		int count_of_space=0;
		for(int i = 0;i<name.length();i++)
		{
			boolean ans = Character.isAlphabetic(c[i]);
			boolean ans1 = Character.isDigit(c[i]);
			boolean ans2 = Character.isSpaceChar(c[i]);
			if(ans==true)
			{
				count_of_alpha++;
			}
			if(ans1==true)
			{
				count_of_numeric++;
			}
			if(ans2==true)
			{
				count_of_space++;
			}
		}
		System.out.println("Count the no of alphabets in the given String: "+count_of_alpha);
		System.out.println("Count the no of numerical values in the given String: "+count_of_numeric);
		System.out.println("Count the no of spaces in the given String: "+count_of_space);
		int count_of_specialcharacters = name.length()-(count_of_alpha+count_of_numeric+count_of_space);
		System.out.println("Count of special characters in the given String: "+count_of_specialcharacters);
	}
}
