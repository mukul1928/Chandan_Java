package Assignments_Java_Classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class class_31_Try_And_Five_Catch_Exceptions 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner s1 = new Scanner(System.in);
			int a = s1.nextInt();
			int in = 1/a;
			System.out.println(in);
		}
		catch(InputMismatchException a1)
		{
			System.out.println("InputMismatchException");
		}
		catch(ArithmeticException a2)
		{
			System.out.println("ArithmeticException");
		}
		catch(ClassCastException a3)
		{
			System.out.println("ClassCast Exception");
		}
		catch(NullPointerException a4)
		{
			System.out.println("NullPointer Exception");
		}
		catch(ArrayIndexOutOfBoundsException a5)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally
		{
			System.out.println("I am always there finally...... !");
		}
	}
}
