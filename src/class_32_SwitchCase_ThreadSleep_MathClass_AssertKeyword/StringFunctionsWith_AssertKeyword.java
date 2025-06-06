package class_32_SwitchCase_ThreadSleep_MathClass_AssertKeyword;

public class StringFunctionsWith_AssertKeyword 
{
	public static void main(String[] args) 
	{
		String name = "I am Student";
		System.out.println(name.length());
		
		assert name.length()>12:"Seems like the given string length is lesser then 21";
		
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.concat(" of batch AB 39"));
		}
	}
}
