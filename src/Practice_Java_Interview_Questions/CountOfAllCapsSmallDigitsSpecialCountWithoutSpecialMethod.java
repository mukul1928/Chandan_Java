package Practice_Java_Interview_Questions;

public class CountOfAllCapsSmallDigitsSpecialCountWithoutSpecialMethod 
{
	public static void main(String[] args) 
	{
		String s1 = "Azarara321@gmail.com";
		int s = 0, c = 0, n = 0, ch = 0;
		String small = "", caps = "", digit = "", spcl = "";
		for (int i = 0; i < s1.length(); i++) 
		{
			char a = s1.charAt(i);
			if (a >= 97 && a <= 122) 
			{
				s++;
				small = small + a;
			} 
			else if (a >= 65 && a <= 90) 
			{
				c++;
				caps = caps + a;
			} 
			else if (a >= 48 && a <= 57)
			{
				n++;
				digit = digit + a;
			} 
			else 
			{
				ch++;
				spcl = spcl + a;
			}
		}
		
		System.out.println("Small==>" + s + "==>" + small);
		System.out.println("Capital==>" + c + "==>" + caps);
		System.out.println("Digit==>" + n + "==>" + digit);
		System.out.println("Special Character==>" + ch);
	}
}
