package class_20_StringFunctions_Palindrome_GetTime;

public class StringFunctions 
{
	public static void main(String[] args) 
	{
		String name = "Orange";
		boolean ans = name.endsWith("e");
		System.out.println(ans);
		String ans1 = name.replace('g', 'A');
		System.out.println(ans1);
		String n1 = "Orange fruit";
		String ans2 = n1.replaceAll("fruit", "and banana");
		System.out.println(ans2);
		
		/*
		 * In the given String "world no 1" remove all the numeric numbers
		 */
		String name1 = "world no 1";
		System.out.println(name1.replaceAll("[0-9]", " "));
		System.out.println(name1.replaceAll("[a-z]", " "));
		String name2 = "chandan KUMAR PANDEY";
		System.out.println(name2.replaceAll("[a-z]", ""));
		System.out.println(name2.replaceAll("[A-Z]", ""));
	}
}

