package Assignments_Java_Classes;

public class class_13_Average_ForLoop 
{
	public static void main(String[] args) 
	{
		double sum = 0;
		double average;
		for(int i = 1;i<=10;i++)
		{
			System.out.println(i);
			sum+=i;
		}
		System.out.println("Sum of 1-10 no is: "+sum);
		average = sum/10;
		System.out.println("Average of 1-10 no is: "+average);
		
	}
}
