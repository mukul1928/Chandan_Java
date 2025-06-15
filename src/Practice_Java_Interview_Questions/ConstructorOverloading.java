package Practice_Java_Interview_Questions;

public class ConstructorOverloading 
{
	ConstructorOverloading(int a,int b)
	{
		int c = a+b;
		System.out.println(c);	
	}
	public static void main (String[] args) 
	{
		ConstructorOverloading a = new ConstructorOverloading(-127,128);
	}
}
