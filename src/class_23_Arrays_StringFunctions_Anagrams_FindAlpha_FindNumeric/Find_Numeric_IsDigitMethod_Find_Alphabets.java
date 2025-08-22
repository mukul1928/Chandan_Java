package class_23_Arrays_StringFunctions_Anagrams_FindAlpha_FindNumeric;

public class Find_Numeric_IsDigitMethod_Find_Alphabets 
{
	public static void main(String[] args) 
	{
		String name = "chandan143";
		char c[] = name.toCharArray();
		for(int i=0;i<=name.length()-1;i++)
		{
			boolean ans = Character.isDigit(c[i]);
			if(ans==false)
			{
				System.out.println("Index position "+ i +" is "+ "Alphabet");
			}
			else
			{
				System.out.println("Index position "+ i +" is "+ "Numeric");
			}
		}
	}
}
