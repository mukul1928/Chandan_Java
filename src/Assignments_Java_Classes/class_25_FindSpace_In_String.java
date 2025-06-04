package Assignments_Java_Classes;

public class class_25_FindSpace_In_String 
{
	public static void main(String[] args) 
	{
		String name = "Chandan Pandey";
		char c[] = name.toCharArray();
		for(int i = 0;i<name.length();i++)
		{
			boolean ans = Character.isSpaceChar(c[i]);
			if(ans==true)
			{
				System.out.println("The given string has a space in it: "+ans);
			}
		}
	}
}
