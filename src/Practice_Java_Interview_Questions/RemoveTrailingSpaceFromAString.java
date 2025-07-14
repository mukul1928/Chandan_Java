package Practice_Java_Interview_Questions;
//String input = "Hello     ";
//String output =Hello
public class RemoveTrailingSpaceFromAString 
{
	public static void main(String[] args) 
	{
		String str1 = "Hello     ";
		String trimmed = removeTrailingSpace(str1);
		System.out.println(trimmed);
	}
	public static String removeTrailingSpace(String str) 
	{
		int end = str.length();//get the total length of the string
		while(end>0 && Character.isWhitespace(str.charAt(end-1)))
		{
			end--;
		}
		return str.substring(0,end);
	}
}
