package Assignments_Java_Classes;

import java.util.Scanner;

public class class_14_ScannerClass_GlobalVariable 
{
	int a;
	int b;
	
	static void add()
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sum = a+b;
		System.out.println("The addition of the a and b is: "+sum);
	}
	void sub()
	{
		Scanner s2 = new Scanner(System.in);
		int a = s2.nextInt();
		int b = s2.nextInt();
		int sub = a-b;
		System.out.println("The subtraction of the a and b is: "+sub);
	}
	static void mul()
	{
		Scanner s3 = new Scanner(System.in);
		int a = s3.nextInt();
		int b = s3.nextInt();
		int mul = a*b;
		System.out.println("The multiplication of the a and b is: "+mul);
	}
	void div()
	{
		Scanner s4 = new Scanner(System.in);
		int a = s4.nextInt();
		int b = s4.nextInt();
		int div = a/b;
		System.out.println("The devision of the a and be is: "+div);
	}
	void modu()
	{
		Scanner s5 = new Scanner(System.in);
		int a = s5.nextInt();
		int b = s5.nextInt();
		int mod = a%b;
		System.out.println("The modulation of the a and be is: "+mod);
	}
	public static void main(String[] args) 
	{
		add();
		class_14_ScannerClass_GlobalVariable c1 = new class_14_ScannerClass_GlobalVariable();
		c1.sub();
		mul();
		c1.div();
		c1.modu();
	}
}
