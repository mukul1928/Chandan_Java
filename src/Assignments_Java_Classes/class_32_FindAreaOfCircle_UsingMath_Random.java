package Assignments_Java_Classes;

public class class_32_FindAreaOfCircle_UsingMath_Random 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++) 
		{
			double pi = Math.PI;
			double r = Math.random();
			System.out.println(pi * r * r);
		}
	}
}
