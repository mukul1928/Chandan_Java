package class_20_StringFunctions_Palindrome_GetTime;

public class Palindrome_Check 
{
	public static void main(String[] args) 
	{
		String name = "mom";
		String reverse = "";
		for(int i = name.length()-1;i>=0;i--)
		{
			char answer = name.charAt(i);
			reverse=reverse+answer;
		}
			System.out.println(reverse);
			boolean ans = name.equals(reverse);
			System.out.println(ans);
		if(ans==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
