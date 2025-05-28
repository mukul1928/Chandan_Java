package Assignments_Java_Classes;

import java.util.Scanner;

public class class_13_ScannerClass_SubMulDivModulous 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int no1 = s1.nextInt();
		int no2 = s1.nextInt();
		int sub = no1 - no2;
		System.out.println(sub);
		
		int no3 = s1.nextInt();
		int no4 = s1.nextInt();
		int mul = no3 * no4;
		System.out.println(mul);
		
		int no5 = s1.nextInt();
		int no6 = s1.nextInt();
		int div = no5 / no6;
		System.out.println(div);
		
		int no7 = s1.nextInt();
		int no8 = s1.nextInt();
		int modu = no7 % no8;
		System.out.println(modu);
		
	}
	
}
