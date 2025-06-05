package class_31_Exceptional_Handling_Arrays_FinallyBlock_ThrowsAndThrow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		try
		{
			int number = s1.nextInt();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Hey exception came but don't worry I handled it");
		}
		finally
		{
			System.out.println("I am always there finally");
		}
	}
}
