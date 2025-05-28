package class_14_Inheritance_In_Java_ScannerClass;

import java.util.Scanner;

public class ScannerssClassInJava 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of no1");
		int no1 = s1.nextInt();
		System.out.println("Enter the value of no2");
		byte no2 = s1.nextByte();
		System.out.println("Enter the value of no3");
		short no3 = s1.nextShort();
		System.out.println("Enter the value of no4");
		long no4 = s1.nextLong();		
	}
}
