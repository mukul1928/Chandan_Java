package class_23_Arrays_StringFunctions_Anagrams_FindAlpha_FindNumeric;

public class FindAlpha_InString 
{
	public static void main(String[] args) 
	{
		String name = "ankita123";
		char c[] = name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			boolean answer = Character.isAlphabetic(c[i]);
			if(answer==true)
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
