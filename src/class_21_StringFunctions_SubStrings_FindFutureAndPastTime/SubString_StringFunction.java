package class_21_StringFunctions_SubStrings_FindFutureAndPastTime;

public class SubString_StringFunction 
{
	public static void main(String[] args) 
	{
		String a = "orange";
		String answer1 = a.substring(1);
		System.out.println(answer1);
		
		String answer2 = a.substring(1, 3);
		System.out.println(answer2);
		
		String s1 = "chandan pandey";
		boolean ans = s1.contains("pandey");
		System.out.println(ans);
		
		String s2 = "orange";
		boolean ans1 = s2.matches("o.....");// for single character search we use . <-(dots)
		System.out.println(ans1);
		boolean ans2 = s1.matches("(.*)y");//for multi character search we use (.*) <- dot astrick
		System.out.println(ans2);
		boolean ans3 = s1.matches("c(.*)");
		System.out.println(ans3);
	}
}
