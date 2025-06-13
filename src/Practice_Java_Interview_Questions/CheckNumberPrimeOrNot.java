package Practice_Java_Interview_Questions;

public class CheckNumberPrimeOrNot 
{
	public static void main(String[] args)
	{
		int a = 13;
		int count = 0;
		for (int i = 2; i <= a / 2; i++) 
		{
			if (a % i == 0) 
			{
				count++;
			}
		}
		if (count == 0) 
		{
			System.out.println("Prime Number");
		} 
		else 
		{
			System.out.println("Not a Prime Number");
		}
	}
}
