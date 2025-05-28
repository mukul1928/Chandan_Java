package class_13_ForLoop_ScannerClass;

import java.util.Scanner;

public class ScannerssClass 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int no1 = s1.nextInt();
		int no2 = s1.nextInt();
		int sum = no1 + no2;
		System.out.println(sum);
	}
}
