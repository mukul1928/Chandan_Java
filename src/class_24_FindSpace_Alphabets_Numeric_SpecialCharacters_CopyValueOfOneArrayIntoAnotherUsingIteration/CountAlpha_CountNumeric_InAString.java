package class_24_FindSpace_Alphabets_Numeric_SpecialCharacters_CopyValueOfOneArrayIntoAnotherUsingIteration;

public class CountAlpha_CountNumeric_InAString 
{
	public static void main(String[] args) 
	{
		String name = "ankita123";
		char c[] = name.toCharArray();
		int count_of_alpha=0;
		int count_of_numeric=0;
		
		for(int i=0;i<name.length();i++)
		{
			boolean ans = Character.isAlphabetic(c[i]);
			if(ans==true)
			{
				count_of_alpha++;
				//System.out.println("Index position "+ i +" is "+ "Alphabet");//printing this is not required
			}
			else
			{
				count_of_numeric++;
				//System.out.println("Index position "+ i +" is "+ "Numeric");//printing this is not required
			}
		}
				System.out.println("Count of alphabets in the given String-> "+ count_of_alpha);
				System.out.println("Count of numeric values in the given String-> "+ count_of_numeric);
	}
}
