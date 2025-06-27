package Practice_Java_Interview_Questions;

public class FibboNacciSeriesFor_Loop 
{
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 2; i <= 10; i++) 
		{
			int sum = a + b; // sum = 0
			a = b;
			b = sum;
			System.out.print(sum + " ");
		}
	}
}
