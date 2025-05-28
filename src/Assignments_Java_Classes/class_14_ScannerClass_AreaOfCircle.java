package Assignments_Java_Classes;

import java.util.Scanner;

public class class_14_ScannerClass_AreaOfCircle 
{
	final static double pi = 3.14;
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		double r = s1.nextDouble();
		double area = pi*r*r;
		System.out.println("The Area Of The Circle Is: " +area);
	}
}
