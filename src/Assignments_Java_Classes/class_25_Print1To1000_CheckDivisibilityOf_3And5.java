package Assignments_Java_Classes;

public class class_25_Print1To1000_CheckDivisibilityOf_3And5 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<1001;i++)
		{
			//System.out.println(i);
			
			if(i%3==0)
			{
				System.out.println("Sun");
			}
			
			if(i%5==0)
			{
				System.out.println("Moon");
			}
			
			if(i%3==0 && i%5==0)
			{
				System.out.println("sun and moon");
			}
			
			else
			{
				System.out.println("Print the remaining numbers: " + i);
			}
		}
	}
}
