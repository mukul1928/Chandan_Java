package Assignments_Java_Classes;

import java.util.Scanner;

public class class_14_ScannerClass_AddSubMulDivModuMainMethod 
{
	static void add()
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sum = a + b;
		System.out.println("The addition of a and b is: "+sum);
	}
	static void sub()
	{
		Scanner s2 = new Scanner(System.in);
		int a = s2.nextInt();
		int b = s2.nextInt();
		int sub = a - b;
		System.out.println("The subtraction of a and b is: "+sub);
	}
	static void mul()
	{
		Scanner s3 = new Scanner(System.in);
		int a = s3.nextInt();
		int b = s3.nextInt();
		int mul = a*b;
		System.out.println("The multiplication of a and be is: "+mul);
	}
	static void div()
	{
		Scanner s4 = new Scanner(System.in);
		int a = s4.nextInt();
		int b = s4.nextInt();
		int div = a/b;
		System.out.println("The division of a and be is: "+div);
	}
	static void modulous()
	{
		Scanner s5 = new Scanner(System.in);
		int a = s5.nextInt();
		int b = s5.nextInt();
		int mod = a%b;
		System.out.println("The modulation of a and b is: "+mod);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		modulous();
	}
}
