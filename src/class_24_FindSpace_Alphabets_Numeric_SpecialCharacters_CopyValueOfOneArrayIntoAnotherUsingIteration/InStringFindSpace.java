package class_24_FindSpace_Alphabets_Numeric_SpecialCharacters_CopyValueOfOneArrayIntoAnotherUsingIteration;

public class InStringFindSpace 
{
	public static void main(String[] args) {
		String name = "chandan pandey";
		char c[] = name.toCharArray();
		for(int i = 0;i<name.length();i++) 
		{
			boolean ans =  Character.isSpaceChar(c[i]);
			if(ans==true)
			{
				System.out.println("There is a space present in the given String" + " The index of space is: " +i );
			}
		}
	}
}
