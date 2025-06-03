package Assignments_Java_Classes;

import java.util.Scanner;

public class class_22_FindArraysSizeUsingScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the element of the Array:");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element at index"	+ i +": ");
			arr[i] = s.nextInt();
		}
		System.out.println("Array created with size: "+arr.length);
				
		s.close();
	}
}
