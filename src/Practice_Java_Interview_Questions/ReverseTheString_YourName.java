package Practice_Java_Interview_Questions;

public class ReverseTheString_YourName 
{
	public static void main(String[] args) 
	{
		String name = "chandan";
		char chr[] = name.toCharArray();
		for (int i = name.length() - 1; i >= 0; i--) 
		{
			System.out.print(chr[i]);
		}
	}
}
