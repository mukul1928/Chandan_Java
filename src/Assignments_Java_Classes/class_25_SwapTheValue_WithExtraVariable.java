package Assignments_Java_Classes;

public class class_25_SwapTheValue_WithExtraVariable 
{
	public static void main(String[] args) 
	{
		int a = 23;
		int b = 35;
		System.out.println("Before swapping the no a: "+a);
		System.out.println("Before swapping the no b: "+b);
		
		int c = 0;
		c = c+a;
		a = b;
		b = c;
		System.out.println("After swapping the no a: "+a);
		System.out.println("After swapping the no b: "+b);
	}
}
