package Assignments_Java_Classes;

public class class_25_SwapTheValueWithoutExtraVariable 
{
	public static void main(String[] args) 
	{
		int a = 234;
		int b = 243;
		
		System.out.println("Before swapping the values");
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping the values");
		System.out.println("a= " +a);
		System.out.println("b= " +b);
	}
}
