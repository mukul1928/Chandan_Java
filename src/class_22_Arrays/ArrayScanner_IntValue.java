package class_22_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner_IntValue 
{
	public static void main(String[] args) 
	{
		int rollno[] = new int[3];
		Scanner s1 = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the value of Array");
			rollno[i] = s1.nextInt();
		}
		Arrays.sort(rollno);
		System.out.println(Arrays.toString(rollno));
	}
}
